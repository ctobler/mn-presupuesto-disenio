package org.camunda.bpm.menini_nicola.mn_presupuesto_disenio.persistencia;

public class Consultas {

	public String existeNroCotización() {
		String consulta ="select cotizacion from mn_presupuesto where cotizacion=?";
		return consulta;
	}
	
	public String insertarCliente() {
		String consulta ="INSERT INTO mn_cliente (nombre, email, telefono, celular) VALUES (?,?,?,?);";
		return consulta;	
	}
	
	public String existeCliente() {
		String consulta = "SELECT nombre FROM mn_cliente WHERE nombre = ?;";
		return consulta;
	}
	
}
