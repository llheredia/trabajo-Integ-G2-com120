import java.util.Date;

public class Incidente {

	private int IncidenteId;
	private Servicio ServicioNro;
	private String Descripcion;
	private Cliente ClienteNro;
	private TipoProblema ProblemaId;
	private Tecnico TecnicoId;
	private int TiempoEstResolucion;
	private Date FechaResolucion;
	private boolean Resuelto;
	
	public int getIncidenteId() {
		return IncidenteId;
	}
	public void setIncidenteId(int incidenteId) {
		IncidenteId = incidenteId;
	}
	
	public Servicio getServicioNro() {
		return ServicioNro;
	}
	public void setServicioNro(Servicio servicioNro) {
		ServicioNro = servicioNro;
	}
	
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	
	public Cliente getClienteNro() {
		return ClienteNro;
	}
	public void setClienteNro(Cliente clienteNro) {
		ClienteNro = clienteNro;
	}
	
	public TipoProblema getProblemaId() {
		return ProblemaId;
	}
	public void setProblemaId(TipoProblema problemaId) {
		ProblemaId = problemaId;
	}
	
	public Tecnico getTecnicoId() {
		return TecnicoId;
	}
	public void setTecnicoId(Tecnico tecnicoId) {
		TecnicoId = tecnicoId;
	}
	
	public int getTiempoEstResolucion() {
		return TiempoEstResolucion;
	}
	public void setTiempoEstResolucion(int tiempoEstResolucion) {
		TiempoEstResolucion = tiempoEstResolucion;
	}
	
	public Date getFechaResolucion() {
		return FechaResolucion;
	}
	public void setFechaResolucion(Date fechaResolucion) {
		FechaResolucion = fechaResolucion;
	}
	
	public boolean isResuelto() {
		return Resuelto;
	}
	public void setResuelto(boolean resuelto) {
		Resuelto = resuelto;
	}
	
}
