package com.example.demo.model;


import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "pagos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pagos.findAll", query = "SELECT p FROM Pagos p")
    , @NamedQuery(name = "Pagos.findById", query = "SELECT p FROM Pagos p WHERE p.id = :id")
    , @NamedQuery(name = "Pagos.findByFormapago", query = "SELECT p FROM Pagos p WHERE p.formapago = :formapago")
    , @NamedQuery(name = "Pagos.findByTipofactura", query = "SELECT p FROM Pagos p WHERE p.tipofactura = :tipofactura")
    , @NamedQuery(name = "Pagos.findBySubtotal", query = "SELECT p FROM Pagos p WHERE p.subtotal = :subtotal")
    , @NamedQuery(name = "Pagos.findBySubtotaliva", query = "SELECT p FROM Pagos p WHERE p.subtotaliva = :subtotaliva")
    , @NamedQuery(name = "Pagos.findBySubtotalcesc", query = "SELECT p FROM Pagos p WHERE p.subtotalcesc = :subtotalcesc")
    , @NamedQuery(name = "Pagos.findBySubtotaldesc", query = "SELECT p FROM Pagos p WHERE p.subtotaldesc = :subtotaldesc")
    , @NamedQuery(name = "Pagos.findByTotalpagar", query = "SELECT p FROM Pagos p WHERE p.totalpagar = :totalpagar")
    , @NamedQuery(name = "Pagos.findByFactura", query = "SELECT p FROM Pagos p WHERE p.factura = :factura")})
public class Pagos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "formapago")
    private String formapago;
    @Basic(optional = false)
    @Column(name = "tipofactura")
    private String tipofactura;
    @Basic(optional = false)
    @Column(name = "subtotal")
    private float subtotal;
    @Basic(optional = false)
    @Column(name = "subtotaliva")
    private float subtotaliva;
    @Basic(optional = false)
    @Column(name = "subtotalcesc")
    private float subtotalcesc;
    @Basic(optional = false)
    @Column(name = "subtotaldesc")
    private float subtotaldesc;
    @Basic(optional = false)
    @Column(name = "totalpagar")
    private float totalpagar;
    @Basic(optional = false)
    @Column(name = "factura")
    private int factura;
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Facturas facturas;

    public Pagos() {
    }

    public Pagos(Integer id) {
        this.id = id;
    }

    public Pagos(Integer id, String formapago, String tipofactura, float subtotal, float subtotaliva, float subtotalcesc, float subtotaldesc, float totalpagar, int factura) {
        this.id = id;
        this.formapago = formapago;
        this.tipofactura = tipofactura;
        this.subtotal = subtotal;
        this.subtotaliva = subtotaliva;
        this.subtotalcesc = subtotalcesc;
        this.subtotaldesc = subtotaldesc;
        this.totalpagar = totalpagar;
        this.factura = factura;
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

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public float getSubtotaliva() {
        return subtotaliva;
    }

    public void setSubtotaliva(float subtotaliva) {
        this.subtotaliva = subtotaliva;
    }

    public float getSubtotalcesc() {
        return subtotalcesc;
    }

    public void setSubtotalcesc(float subtotalcesc) {
        this.subtotalcesc = subtotalcesc;
    }

    public float getSubtotaldesc() {
        return subtotaldesc;
    }

    public void setSubtotaldesc(float subtotaldesc) {
        this.subtotaldesc = subtotaldesc;
    }

    public float getTotalpagar() {
        return totalpagar;
    }

    public void setTotalpagar(float totalpagar) {
        this.totalpagar = totalpagar;
    }

    public int getFactura() {
        return factura;
    }

    public void setFactura(int factura) {
        this.factura = factura;
    }

    public Facturas getFacturas() {
        return facturas;
    }

    public void setFacturas(Facturas facturas) {
        this.facturas = facturas;
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
        if (!(object instanceof Pagos)) {
            return false;
        }
        Pagos other = (Pagos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication3.Pagos[ id=" + id + " ]";
    }
    
}
