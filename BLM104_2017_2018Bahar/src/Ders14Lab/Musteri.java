/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14Lab;

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
@Table(name = "MUSTERI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Musteri.findAll", query = "SELECT m FROM Musteri m"),
    @NamedQuery(name = "Musteri.findByMusteriId", query = "SELECT m FROM Musteri m WHERE m.musteriId = :musteriId"),
    @NamedQuery(name = "Musteri.findByAdi", query = "SELECT m FROM Musteri m WHERE m.adi = :adi"),
    @NamedQuery(name = "Musteri.findBySoyadi", query = "SELECT m FROM Musteri m WHERE m.soyadi = :soyadi"),
    @NamedQuery(name = "Musteri.findByOdeme", query = "SELECT m FROM Musteri m WHERE m.odeme = :odeme"),
    @NamedQuery(name = "Musteri.findByToplamSatis", query = "SELECT m FROM Musteri m WHERE m.toplamSatis = :toplamSatis")})
public class Musteri implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MUSTERI_ID")
    private Integer musteriId;
    @Column(name = "ADI")
    private String adi;
    @Column(name = "SOYADI")
    private String soyadi;
    @Column(name = "ODEME")
    private Integer odeme;
    @Column(name = "TOPLAM_SATIS")
    private Integer toplamSatis;

    public Musteri() {
    }

    public Musteri(Integer musteriId) {
        this.musteriId = musteriId;
    }

    public Integer getMusteriId() {
        return musteriId;
    }

    public void setMusteriId(Integer musteriId) {
        this.musteriId = musteriId;
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

    public Integer getOdeme() {
        return odeme;
    }

    public void setOdeme(Integer odeme) {
        this.odeme = odeme;
    }

    public Integer getToplamSatis() {
        return toplamSatis;
    }

    public void setToplamSatis(Integer toplamSatis) {
        this.toplamSatis = toplamSatis;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (musteriId != null ? musteriId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Musteri)) {
            return false;
        }
        Musteri other = (Musteri) object;
        if ((this.musteriId == null && other.musteriId != null) || (this.musteriId != null && !this.musteriId.equals(other.musteriId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ders14Lab.Musteri[ musteriId=" + musteriId + " ]";
    }
    
}
