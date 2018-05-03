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
@Table(name = "PERSONEL_TELEFON")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonelTelefon.findAll", query = "SELECT p FROM PersonelTelefon p"),
    @NamedQuery(name = "PersonelTelefon.findByPtId", query = "SELECT p FROM PersonelTelefon p WHERE p.ptId = :ptId"),
    @NamedQuery(name = "PersonelTelefon.findByPId", query = "SELECT p FROM PersonelTelefon p WHERE p.pId = :pId"),
    @NamedQuery(name = "PersonelTelefon.findByTId", query = "SELECT p FROM PersonelTelefon p WHERE p.tId = :tId"),
    @NamedQuery(name = "PersonelTelefon.findByAlimFiyat", query = "SELECT p FROM PersonelTelefon p WHERE p.alimFiyat = :alimFiyat")})
public class PersonelTelefon implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PT_ID")
    private Integer ptId;
    @Column(name = "P_ID")
    private Integer pId;
    @Column(name = "T_ID")
    private Integer tId;
    @Column(name = "ALIM_FIYAT")
    private Integer alimFiyat;

    public PersonelTelefon() {
    }

    public PersonelTelefon(Integer ptId) {
        this.ptId = ptId;
    }

    public Integer getPtId() {
        return ptId;
    }

    public void setPtId(Integer ptId) {
        this.ptId = ptId;
    }

    public Integer getPId() {
        return pId;
    }

    public void setPId(Integer pId) {
        this.pId = pId;
    }

    public Integer getTId() {
        return tId;
    }

    public void setTId(Integer tId) {
        this.tId = tId;
    }

    public Integer getAlimFiyat() {
        return alimFiyat;
    }

    public void setAlimFiyat(Integer alimFiyat) {
        this.alimFiyat = alimFiyat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ptId != null ? ptId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonelTelefon)) {
            return false;
        }
        PersonelTelefon other = (PersonelTelefon) object;
        if ((this.ptId == null && other.ptId != null) || (this.ptId != null && !this.ptId.equals(other.ptId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ders12Lab.PersonelTelefon[ ptId=" + ptId + " ]";
    }
    
}
