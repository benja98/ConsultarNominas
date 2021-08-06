package com.example.demo.model;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
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
@NamedQueries({
    @NamedQuery(name = "Facturas.findAll", query = "SELECT f FROM Facturas f")
    , @NamedQuery(name = "Facturas.findById", query = "SELECT f FROM Facturas f WHERE f.id = :id")
    , @NamedQuery(name = "Facturas.findByFecha", query = "SELECT f FROM Facturas f WHERE f.fecha = :fecha")
    , @NamedQuery(name = "Facturas.findByEmpresa", query = "SELECT f FROM Facturas f WHERE f.empresa = :empresa")
    , @NamedQuery(name = "Facturas.findByFacturanum", query = "SELECT f FROM Facturas f WHERE f.facturanum = :facturanum")
    , @NamedQuery(name = "Facturas.findByFechaventa", query = "SELECT f FROM Facturas f WHERE f.fechaventa = :fechaventa")
    , @NamedQuery(name = "Facturas.findByFechapago", query = "SELECT f FROM Facturas f WHERE f.fechapago = :fechapago")
    , @NamedQuery(name = "Facturas.findByImpaga", query = "SELECT f FROM Facturas f WHERE f.impaga = :impaga")
    , @NamedQuery(name = "Facturas.findByImpresa", query = "SELECT f FROM Facturas f WHERE f.impresa = :impresa")
    , @NamedQuery(name = "Facturas.findByPago", query = "SELECT f FROM Facturas f WHERE f.pago = :pago")})
public class Facturas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "empresa")
    private String empresa;
    @Basic(optional = false)
    @Column(name = "facturanum")
    private int facturanum;
    @Basic(optional = false)
    @Column(name = "fechaventa")
    @Temporal(TemporalType.DATE)
    private Date fechaventa;
    @Basic(optional = false)
    @Column(name = "fechapago")
    @Temporal(TemporalType.DATE)
    private Date fechapago;
    @Basic(optional = false)
    @Column(name = "impaga")
    private String impaga;
    @Basic(optional = false)
    @Column(name = "impresa")
    private String impresa;
    @Basic(optional = false)
    @Column(name = "pago")
    private int pago;
    @OneToOne(cascade = CascadeType.MERGE, mappedBy = "facturas")
    private Pagos pagos;

    public Facturas() {
    }

    public Facturas(Integer id) {
        this.id = id;
    }

    public Facturas(Integer id, Date fecha, String empresa, int facturanum, Date fechaventa, Date fechapago, String impaga, String impresa, int pago) {
        this.id = id;
        this.fecha = fecha;
        this.empresa = empresa;
        this.facturanum = facturanum;
        this.fechaventa = fechaventa;
        this.fechapago = fechapago;
        this.impaga = impaga;
        this.impresa = impresa;
        this.pago = pago;
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

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getFacturanum() {
        return facturanum;
    }

    public void setFacturanum(int facturanum) {
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

    public int getPago() {
        return pago;
    }

    public void setPago(int pago) {
        this.pago = pago;
    }

    public Pagos getPagos() {
        return pagos;
    }

    public void setPagos(Pagos pagos) {
        this.pagos = pagos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facturas)) {
            return false;
        }
        Facturas other = (Facturas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication3.Facturas[ id=" + id + " ]";
    }
    
}
