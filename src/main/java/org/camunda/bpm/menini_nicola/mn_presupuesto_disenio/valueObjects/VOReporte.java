package org.camunda.bpm.menini_nicola.mn_presupuesto_disenio.valueObjects;

public class VOReporte {
	
	String nombrePresupuesto;
	String cliente;
	String email;
	String tel;
	String urlImagen;
	String nombreProducto;
	String moneda;
	String precio;
	String descripcion;
	String dimensiones;
	String condiciones;
	String formaDePago;
	String tiempoDeEntrega;
	String descuento;
	String sobreCosto;
	String precioFinal;	
	String materiales;
	String terminacion;
	String tipoCliente;
	
	public VOReporte() {
		super();
	}
		
	public VOReporte(String nombrePresupuesto, String cliente, String email, String tel, String urlImagen,
			String nombreProducto, String moneda, String precio, String descripcion, String dimensiones,
			String condiciones, String formaDePago, String tiempoDeEntrega, String descuento, String sobreCosto,
			String precioFinal, String materiales, String terminacion, String tipoCliente) {
		super();
		this.nombrePresupuesto = nombrePresupuesto;
		this.cliente = cliente;
		this.email = email;
		this.tel = tel;
		this.urlImagen = urlImagen;
		this.nombreProducto = nombreProducto;
		this.moneda = moneda;
		this.precio = precio;
		this.descripcion = descripcion;
		this.dimensiones = dimensiones;
		this.condiciones = condiciones;
		this.formaDePago = formaDePago;
		this.tiempoDeEntrega = tiempoDeEntrega;
		this.descuento = descuento;
		this.sobreCosto = sobreCosto;
		this.precioFinal = precioFinal;
		this.materiales = materiales;
		this.terminacion = terminacion;
		this.tipoCliente=tipoCliente;
	}



	public String getNombrePresupuesto() {
		return nombrePresupuesto;
	}
	public void setNombrePresupuesto(String nombrePresupuesto) {
		this.nombrePresupuesto = nombrePresupuesto;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDimensiones() {
		return dimensiones;
	}
	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}
	public String getCondiciones() {
		return condiciones;
	}
	public void setCondiciones(String condiciones) {
		this.condiciones = condiciones;
	}
	public String getFormaDePago() {
		return formaDePago;
	}
	public void setFormaDePago(String formaDePago) {
		this.formaDePago = formaDePago;
	}
	public String getTiempoDeEntrega() {
		return tiempoDeEntrega;
	}
	public void setTiempoDeEntrega(String tiempoDeEntrega) {
		this.tiempoDeEntrega = tiempoDeEntrega;
	}
	public String getDescuento() {
		return descuento;
	}
	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}
	public String getSobreCosto() {
		return sobreCosto;
	}
	public void setSobreCosto(String sobreCosto) {
		this.sobreCosto = sobreCosto;
	}
	public String getPrecioFinal() {
		return precioFinal;
	}
	public void setPrecioFinal(String precioFinal) {
		this.precioFinal = precioFinal;
	}

	public String getUrlImagen() {
		return urlImagen;
	}

	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getMateriales() {
		return materiales;
	}

	public void setMateriales(String materiales) {
		this.materiales = materiales;
	}

	public String getTerminacion() {
		return terminacion;
	}

	public void setTerminacion(String terminacion) {
		this.terminacion = terminacion;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	
	
	
}
