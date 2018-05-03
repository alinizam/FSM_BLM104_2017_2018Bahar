/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12Lab;

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
@Table(name = "BIRIM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Birim.findAll", query = "SELECT b FROM Birim b"),
    @NamedQuery(name = "Birim.findByBirimId", query = "SELECT b FROM Birim b WHERE b.birimId = :birimId"),
    @NamedQuery(name = "Birim.findByBirimAdi", query = "SELECT b FROM Birim b WHERE b.birimAdi = :birimAdi"),
    @NamedQuery(name = "Birim.findByAdresIl", query = "SELECT b FROM Birim b WHERE b.adresIl = :adresIl"),
    @NamedQuery(name = "Birim.findByKazanc", query = "SELECT b FROM Birim b WHERE b.kazanc = :kazanc")})
public class Birim implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BIRIM_ID")
    private Integer birimId;
    @Column(name = "BIRIM_ADI")
    private String birimAdi;
    @Column(name = "ADRES_IL")
    private Integer adresIl;
    @Column(name = "KAZANC")
    private Integer kazanc;

    public Birim() {
    }

    public Birim(Integer birimId) {
        this.birimId = birimId;
    }

    public Integer getBirimId() {
        return birimId;
    }

    public void setBirimId(Integer birimId) {
        this.birimId = birimId;
    }

    public String getBirimAdi() {
        return birimAdi;
    }

    public void setBirimAdi(String birimAdi) {
        this.birimAdi = birimAdi;
    }

    public Integer getAdresIl() {
        return adresIl;
    }

    public void setAdresIl(Integer adresIl) {
        this.adresIl = adresIl;
    }

    public Integer getKazanc() {
        return kazanc;
    }

    public void setKazanc(Integer kazanc) {
        this.kazanc = kazanc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (birimId != null ? birimId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Birim)) {
            return false;
        }
        Birim other = (Birim) object;
        if ((this.birimId == null && other.birimId != null) || (this.birimId != null && !this.birimId.equals(other.birimId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ders12Lab.Birim[ birimId=" + birimId + " ]";
    }
    
}
