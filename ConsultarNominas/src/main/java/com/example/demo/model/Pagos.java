package com.example.demo.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "pagos")
@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "Pagos.findAll", query = "SELECT p FROM Pagos p")
//    , @NamedQuery(name = "Pagos.findById", query = "SELECT p FROM Pagos p WHERE p.id = :id")
//    , @NamedQuery(name = "Pagos.findByFormapago", query = "SELECT p FROM Pagos p WHERE p.formapago = :formapago")
//    , @NamedQuery(name = "Pagos.findByTipofactura", query = "SELECT p FROM Pagos p WHERE p.tipofactura = :tipofactura")
//    , @NamedQuery(name = "Pagos.findBySubtotal", query = "SELECT p FROM Pagos p WHERE p.subtotal = :subtotal")
//    , @NamedQuery(name = "Pagos.findBySubtotaliva", query = "SELECT p FROM Pagos p WHERE p.subtotaliva = :subtotaliva")
//    , @NamedQuery(name = "Pagos.findBySubtotalcesc", query = "SELECT p FROM Pagos p WHERE p.subtotalcesc = :subtotalcesc")
//    , @NamedQuery(name = "Pagos.findBySubtotaldesc", query = "SELECT p FROM Pagos p WHERE p.subtotaldesc = :subtotaldesc")
//    , @NamedQuery(name = "Pagos.findByTotalpagar", query = "SELECT p FROM Pagos p WHERE p.totalpagar = :totalpagar")})
public class Pagos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "formapago")
    private String formapago;
    @Column(name = "tipofactura")
    private String tipofactura;
    @Column(name = "subtotal")
    private Double subtotal;
    @Column(name = "subtotaliva")
    private Double subtotaliva;
    @Column(name = "subtotalcesc")
    private Double subtotalcesc;
    @Column(name = "subtotaldesc")
    private Double subtotaldesc;
    @Column(name = "totalpagar")
    private Double totalpagar;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pago")
    private Collection<Facturas> facturasCollection;

    public Pagos() {
    }

    public Pagos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFormapago() {
        return formapago;
    }

    public void setFormapago(String formapago) {
        this.formapago = formapago;
    }

    public String getTipofactura() {
        return tipofactura;
    }

    public void setTipofactura(String tipofactura) {
        this.tipofactura = tipofactura;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getSubtotaliva() {
        return subtotaliva;
    }

    public void setSubtotaliva(Double subtotaliva) {
        this.subtotaliva = subtotaliva;
    }

    public Double getSubtotalcesc() {
        return subtotalcesc;
    }

    public void setSubtotalcesc(Double subtotalcesc) {
        this.subtotalcesc = subtotalcesc;
    }

    public Double getSubtotaldesc() {
        return subtotaldesc;
    }

    public void setSubtotaldesc(Double subtotaldesc) {
        this.subtotaldesc = subtotaldesc;
    }

    public Double getTotalpagar() {
        return totalpagar;
    }

    public void setTotalpagar(Double totalpagar) {
        this.totalpagar = totalpagar;
    }

    @XmlTransient
    public Collection<Facturas> getFacturasCollection() {
        return facturasCollection;
    }

    public void setFacturasCollection(Collection<Facturas> facturasCollection) {
        this.facturasCollection = facturasCollection;
    }

//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (id != null ? id.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof Pagos)) {
//            return false;
//        }
//        Pagos other = (Pagos) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "javaapplication2.Pagos[ id=" + id + " ]";
//    }
//    
}
