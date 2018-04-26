/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11.Ornek1;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author anizam
 */
@Entity
@Table(name = "MEMUR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Memur.findAll", query = "SELECT m FROM Memur m"),
    @NamedQuery(name = "Memur.findByMemurId", query = "SELECT m FROM Memur m WHERE m.memurId = :memurId"),
    @NamedQuery(name = "Memur.findByAdi", query = "SELECT m FROM Memur m WHERE m.adi = :adi"),
    @NamedQuery(name = "Memur.findBySoyadi", query = "SELECT m FROM Memur m WHERE m.soyadi = :soyadi")})
public class Memur implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MEMUR_ID")
    private Integer memurId;
    @Column(name = "ADI")
    private String adi;
    @Column(name = "SOYADI")
    private String soyadi;

    public Memur() {
    }

    public Memur(Integer memurId) {
        this.memurId = memurId;
    }

    public Integer getMemurId() {
        return memurId;
    }

    public void setMemurId(Integer memurId) {
        Integer oldMemurId = this.memurId;
        this.memurId = memurId;
        changeSupport.firePropertyChange("memurId", oldMemurId, memurId);
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        String oldAdi = this.adi;
        this.adi = adi;
        changeSupport.firePropertyChange("adi", oldAdi, adi);
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        String oldSoyadi = this.soyadi;
        this.soyadi = soyadi;
        changeSupport.firePropertyChange("soyadi", oldSoyadi, soyadi);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (memurId != null ? memurId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Memur)) {
            return false;
        }
        Memur other = (Memur) object;
        if ((this.memurId == null && other.memurId != null) || (this.memurId != null && !this.memurId.equals(other.memurId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ders11.Ornek1.Memur[ memurId=" + memurId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
