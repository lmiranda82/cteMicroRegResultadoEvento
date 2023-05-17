package mx.com.sodexo.entidades;

import java.util.Date;

public class EventoRealizado {
	private long numEvento;
	private String descripcion;
	private Date fechaInicio;
	private Date fechaFin;
	
	public EventoRealizado() {
		super();
	}
	
	public EventoRealizado(long numEvento, String descripcion, Date fechaInicio, Date fechaFin) {
		super();
		this.numEvento = numEvento;
		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

	public long getNumEvento() {
		return numEvento;
	}

	public void setNumEvento(long numEvento) {
		this.numEvento = numEvento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	@Override
	public String toString() {
		return "EventoRealizado [numEvento=" + numEvento + ", descripcion=" + descripcion + ", fechaInicio="
				+ fechaInicio + ", fechaFin=" + fechaFin + "]";
	}
	
}
