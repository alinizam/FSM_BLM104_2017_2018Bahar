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
@Table(name = "SATIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Satis.findAll", query = "SELECT s FROM Satis s"),
    @NamedQuery(name = "Satis.findBySid", query = "SELECT s FROM Satis s WHERE s.sid = :sid"),
    @NamedQuery(name = "Satis.findByMalId", query = "SELECT s FROM Satis s WHERE s.malId = :malId"),
    @NamedQuery(name = "Satis.findByTutar", query = "SELECT s FROM Satis s WHERE s.tutar = :tutar"),
    @NamedQuery(name = "Satis.findByAdet", query = "SELECT s FROM Satis s WHERE s.adet = :adet"),
    @NamedQuery(name = "Satis.findByMusteriId", query = "SELECT s FROM Satis s WHERE s.musteriId = :musteriId")})
public class Satis implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SID")
    private Integer sid;
    @Column(name = "MAL_ID")
    private Integer malId;
    @Column(name = "TUTAR")
    private Integer tutar;
    @Column(name = "ADET")
    private Integer adet;
    @Column(name = "MUSTERI_ID")
    private Integer musteriId;

    public Satis() {
    }

    public Satis(Integer sid) {
        this.sid = sid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getMalId() {
        return malId;
    }

    public void setMalId(Integer malId) {
        this.malId = malId;
    }

    public Integer getTutar() {
        return tutar;
    }

    public void setTutar(Integer tutar) {
        this.tutar = tutar;
    }

    public Integer getAdet() {
        return adet;
    }

    public void setAdet(Integer adet) {
        this.adet = adet;
    }

    public Integer getMusteriId() {
        return musteriId;
    }

    public void setMusteriId(Integer musteriId) {
        this.musteriId = musteriId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sid != null ? sid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Satis)) {
            return false;
        }
        Satis other = (Satis) object;
        if ((this.sid == null && other.sid != null) || (this.sid != null && !this.sid.equals(other.sid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ders14Lab.Satis[ sid=" + sid + " ]";
    }
    
}
