/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13Lab;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author anizam
 */
@Entity
@Table(name = "CALISAN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Calisan.findAll", query = "SELECT c FROM Calisan c"),
    @NamedQuery(name = "Calisan.findByCalisanId", query = "SELECT c FROM Calisan c WHERE c.calisanId = :calisanId"),
    @NamedQuery(name = "Calisan.findByAdi", query = "SELECT c FROM Calisan c WHERE c.adi = :adi"),
    @NamedQuery(name = "Calisan.findBySoyadi", query = "SELECT c FROM Calisan c WHERE c.soyadi = :soyadi"),
    @NamedQuery(name = "Calisan.findByMaas", query = "SELECT c FROM Calisan c WHERE c.maas = :maas")})
public class Calisan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CALISAN_ID")
    private Integer calisanId;
    @Column(name = "ADI")
    private String adi;
    @Column(name = "SOYADI")
    private String soyadi;
    @Column(name = "MAAS")
    private Integer maas;

    public Calisan() {
    }

    public Calisan(Integer calisanId) {
        this.calisanId = calisanId;
    }

    public Integer getCalisanId() {
        return calisanId;
    }

    public void setCalisanId(Integer calisanId) {
        this.calisanId = calisanId;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public Integer getMaas() {
        return maas;
    }

    public void setMaas(Integer maas) {
        this.maas = maas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (calisanId != null ? calisanId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Calisan)) {
            return false;
        }
        Calisan other = (Calisan) object;
        if ((this.calisanId == null && other.calisanId != null) || (this.calisanId != null && !this.calisanId.equals(other.calisanId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ders13Lab.Calisan[ calisanId=" + calisanId + " ]";
    }
    
}
