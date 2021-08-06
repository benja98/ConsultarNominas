package com.example.demo.dao;

import java.io.Serializable;
import java.util.Date;

public class ProcedimientosDao implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idfactura;
	private Date fecha;
	private Integer empresa;
	private Integer facturanum;
	private Date fechaventa;
	private Date fechapago;
	private String impaga;
	private String impresa;
	private Integer pago;
	
	private Integer idempresa;
	private String nombre;
	
	private Integer idpagos;
	private String fromapago;
	private String tipofactura;
	private Double subtotal;
	private Double subtotaliva;
	private Double subtotalcesc;
	private Double subtotaldesc;
	private Double totalpagar;
	private Integer factura;
	
	public ProcedimientosDao(Integer idfactura, Date fecha, Integer empresa, Integer facturanum, Date fechaventa,
			Date fechapago, String impaga, String impresa, Integer pago, Integer idempresa, String nombre,
			Integer idpagos, String fromapago, String tipofactura, Double subtotal, Double subtotaliva,
			Double subtotalcesc, Double subtotaldesc, Double totalpagar, Integer factura) {
		super();
		this.idfactura = idfactura;
		this.fecha = fecha;
		this.empresa = empresa;
		this.facturanum = facturanum;
		this.fechaventa = fechaventa;
		this.fechapago = fechapago;
		this.impaga = impaga;
		this.impresa = impresa;
		this.pago = pago;
		this.idempresa = idempresa;
		this.nombre = nombre;
		this.idpagos = idpagos;
		this.fromapago = fromapago;
		this.tipofactura = tipofactura;
		this.subtotal = subtotal;
		this.subtotaliva = subtotaliva;
		this.subtotalcesc = subtotalcesc;
		this.subtotaldesc = subtotaldesc;
		this.totalpagar = totalpagar;
		this.factura = factura;
	}
	public Integer getIdfactura() {
		return idfactura;
	}
	public void setIdfactura(Integer idfactura) {
		this.idfactura = idfactura;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Integer getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Integer empresa) {
		this.empresa = empresa;
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
	public Integer getPago() {
		return pago;
	}
	public void setPago(Integer pago) {
		this.pago = pago;
	}
	public Integer getIdempresa() {
		return idempresa;
	}
	public void setIdempresa(Integer idempresa) {
		this.idempresa = idempresa;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getIdpagos() {
		return idpagos;
	}
	public void setIdpagos(Integer idpagos) {
		this.idpagos = idpagos;
	}
	public String getFromapago() {
		return fromapago;
	}
	public void setFromapago(String fromapago) {
		this.fromapago = fromapago;
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
	public Integer getFactura() {
		return factura;
	}
	public void setFactura(Integer factura) {
		this.factura = factura;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

    
}
