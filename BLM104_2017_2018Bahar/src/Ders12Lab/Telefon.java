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
@Table(name = "TELEFON")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Telefon.findAll", query = "SELECT t FROM Telefon t"),
    @NamedQuery(name = "Telefon.findByTelId", query = "SELECT t FROM Telefon t WHERE t.telId = :telId"),
    @NamedQuery(name = "Telefon.findByTelAdi", query = "SELECT t FROM Telefon t WHERE t.telAdi = :telAdi"),
    @NamedQuery(name = "Telefon.findBySatisFiyat", query = "SELECT t FROM Telefon t WHERE t.satisFiyat = :satisFiyat")})
public class Telefon implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TEL_ID")
    private Integer telId;
    @Column(name = "TEL_ADI")
    private String telAdi;
    @Column(name = "SATIS_FIYAT")
    private Integer satisFiyat;

    public Telefon() {
    }

    public Telefon(Integer telId) {
        this.telId = telId;
    }

    public Integer getTelId() {
        return telId;
    }

    public void setTelId(Integer telId) {
        this.telId = telId;
    }

    public String getTelAdi() {
        return telAdi;
    }

    public void setTelAdi(String telAdi) {
        this.telAdi = telAdi;
    }

    public Integer getSatisFiyat() {
        return satisFiyat;
    }

    public void setSatisFiyat(Integer satisFiyat) {
        this.satisFiyat = satisFiyat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (telId != null ? telId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Telefon)) {
            return false;
        }
        Telefon other = (Telefon) object;
        if ((this.telId == null && other.telId != null) || (this.telId != null && !this.telId.equals(other.telId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ders12Lab.Telefon[ telId=" + telId + " ]";
    }
    
}
