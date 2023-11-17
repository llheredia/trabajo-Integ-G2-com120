public class Cliente {
	
	private int ClienteId;
	private String Cuit;
	private String RazonSocial;
	private Servicio ServicioContratado;
	
	
	public int getClienteId() {
		return ClienteId;
	}
	public void setClienteId(int clienteId) {
		ClienteId = clienteId;
	}
	
	public String getCuit() {
		return Cuit;
	}
	public void setCuit(String cuit) {
		Cuit = cuit;
	}
	
	public String getRazonSocial() {
		return RazonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		RazonSocial = razonSocial;
	}
	
	public Servicio getServicioContratado() {
		return ServicioContratado;
	}
	public void setServicioContratado(Servicio servicioContratado) {
		ServicioContratado = servicioContratado;
	}

}
