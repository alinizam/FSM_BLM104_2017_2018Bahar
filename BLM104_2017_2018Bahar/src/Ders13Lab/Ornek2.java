/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13Lab;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author anizam
 */
public class Ornek2 {

    public static void main(String[] args) {
        DataOutputStream doS = null;
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("BLM104_2017_2018BaharPU");
            EntityManager em = emf.createEntityManager();
            Query q = em.createQuery("select c from Calisan c");
            List<Calisan> calisanlar = q.getResultList();
            doS = new DataOutputStream(new FileOutputStream("C:\\dosyalar\\calisanlar"));
            for (Calisan calisan : calisanlar) {
                doS.writeInt(calisan.getCalisanId());
                doS.writeUTF(calisan.getAdi());
                doS.writeUTF(calisan.getSoyadi());
                doS.writeInt(calisan.getMaas());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ornek2.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                doS.close();
            } catch (IOException ex) {
                Logger.getLogger(Ornek2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            DataInputStream dIs = new DataInputStream(new FileInputStream("C:\\dosyalar\\calisanlar"));
            while (dIs.available() > 0) {
                Calisan c = new Calisan();
                c.setCalisanId(dIs.readInt() + 10);
                c.setAdi(dIs.readUTF());
                c.setSoyadi(dIs.readUTF());
                c.setMaas(dIs.readInt()+100);
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("BLM104_2017_2018BaharPU");
                EntityManager em = emf.createEntityManager();
                em.getTransaction().begin();
                em.persist(c);
                em.getTransaction().commit();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ornek2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
