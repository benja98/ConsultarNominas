package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "facturas")
@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "Facturas.findAll", query = "SELECT f FROM Facturas f")
//    , @NamedQuery(name = "Facturas.findById", query = "SELECT f FROM Facturas f WHERE f.id = :id")
//    , @NamedQuery(name = "Facturas.findByFecha", query = "SELECT f FROM Facturas f WHERE f.fecha = :fecha")
//    , @NamedQuery(name = "Facturas.findByFacturanum", query = "SELECT f FROM Facturas f WHERE f.facturanum = :facturanum")
//    , @NamedQuery(name = "Facturas.findByFechaventa", query = "SELECT f FROM Facturas f WHERE f.fechaventa = :fechaventa")
//    , @NamedQuery(name = "Facturas.findByFechapago", query = "SELECT f FROM Facturas f WHERE f.fechapago = :fechapago")
//    , @NamedQuery(name = "Facturas.findByImpaga", query = "SELECT f FROM Facturas f WHERE f.impaga = :impaga")
//    , @NamedQuery(name = "Facturas.findByImpresa", query = "SELECT f FROM Facturas f WHERE f.impresa = :impresa")})
public class Facturas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "facturanum")
    private Integer facturanum;
    @Column(name = "fechaventa")
    @Temporal(TemporalType.DATE)
    private Date fechaventa;
    @Column(name = "fechapago")
    @Temporal(TemporalType.DATE)
    private Date fechapago;
    @Column(name = "impaga")
    private String impaga;
    @Column(name = "impresa")
    private String impresa;
    @JoinColumn(name = "empresa", referencedColumnName = "id")
    @ManyToOne
    private Empresas empresa;
    @JoinColumn(name = "pago", referencedColumnName = "id")
    @ManyToOne
    private Pagos pago;

    public Facturas() {
    }

    public Facturas(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getFacturanum() {
        return facturanum;
    }

    public void setFacturanum(Integer facturanum) {
        this.facturanum = facturanum;
    }

    public Date getFechaventa() {
        return fechaventa;
    }

    public void setFechaventa(Date fechaventa) {
        this.fechaventa = fechaventa;
    }

    public Date getFechapago() {
        return fechapago;
    }

    public void setFechapago(Date fechapago) {
        this.fechapago = fechapago;
    }

    public String getImpaga() {
        return impaga;
    }

    public void setImpaga(String impaga) {
        this.impaga = impaga;
    }

    public String getImpresa() {
        return impresa;
    }

    public void setImpresa(String impresa) {
        this.impresa = impresa;
    }

    public Empresas getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresas empresa) {
        this.empresa = empresa;
    }

    public Pagos getPago() {
        return pago;
    }

    public void setPago(Pagos pago) {
        this.pago = pago;
    }

//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (id != null ? id.hashCode() : 0);
//        return hash;
//    }

//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof Facturas)) {
//            return false;
//        }
//        Facturas other = (Facturas) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "javaapplication2.Facturas[ id=" + id + " ]";
//    }
//    
}
