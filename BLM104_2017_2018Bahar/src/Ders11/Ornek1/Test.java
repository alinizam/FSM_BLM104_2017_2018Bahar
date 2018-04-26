/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11.Ornek1;

import java.math.BigDecimal;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author anizam
 */
public class Test {

    public static void main(String[] args) {
       parametrikSorgu();
    }

    static void sorgu() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BLM104_2017_2018BaharPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("select m from Memur m");
        List<Memur> memurlar = q.getResultList();
        for (Memur memur : memurlar) {
            System.out.println(memur.getMemurId() + ":" + memur.getAdi() + " " + memur.getSoyadi());
        }

        em.close();
        emf.close();

    }

    static void ekle() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BLM104_2017_2018BaharPU");
        EntityManager em = emf.createEntityManager();
        Memur m = new Memur();
        m.setMemurId(16);
        m.setAdi("Ahmet");
        m.setSoyadi("Ak");
        em.getTransaction().begin();
        em.persist(m);
        em.getTransaction().commit();
        em.close();
        emf.close();

    }
    
    
     static void sil() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BLM104_2017_2018BaharPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("delete from Memur m where m.memurId=15");
        
        em.getTransaction().begin();
        q.executeUpdate();
        em.getTransaction().commit();

        em.close();
        emf.close();

    }
     
    static void degistir() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BLM104_2017_2018BaharPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("update Memur m set m.adi='Mehmet' where m.memurId=16");
        
        em.getTransaction().begin();
        q.executeUpdate();
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
    
    static void parametrikSorgu(){
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BLM104_2017_2018BaharPU");
        EntityManager em=emf.createEntityManager();
        
        //Query q=em.createQuery("select d from DiscountCode d where d.rate>:pRate");
        Query q=em.createNamedQuery("DiscountCode.findUpperRate");
        q.setParameter("rate", 5);
        
        em.getTransaction().begin();
        List<DiscountCode> kodList=q.getResultList();
        for (DiscountCode dc : kodList) {
            System.out.println(dc.getDiscountCode()+" "+dc.getRate());
            em.persist(dc);
            dc.setRate(dc.getRate().add(BigDecimal.valueOf(10.0)));
        }
        System.out.println("---------------------");
        em.getTransaction().commit();
       
        // Ayn? anda nesne üzerinden de?i?iklik ve arka plandan sorgu yap?nca hata olabilir.        
        Query updateQuery=em.createQuery("update DiscountCode d set d.rate=30 where d.rate>15");
        em.getTransaction().begin();
        updateQuery.executeUpdate();
        em.getTransaction().commit();
        
        for (DiscountCode dc : kodList) {
            System.out.println(dc.getDiscountCode()+" "+dc.getRate());
         
        }
    }

}
