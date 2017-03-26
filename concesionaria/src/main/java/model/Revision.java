package model;


import java.util.Date;


public class Revision {
	private boolean filtro;
	private Date fecha;
	private boolean aceite;
	private boolean freno;
	private boolean revisionMotor;
	private long oid;
	
/**
* Constructor de la clase Revision sin parametros
*/	
	
public Revision(){
	this.setFiltro(false);
	this.setFecha(null);
	this.setAceite(false);
	this.setFreno(false);
	this.setRevisionMotor(false);
		
}

public boolean isFiltro() {
	return filtro;
}

public void setFiltro(boolean filtro) {
	this.filtro = filtro;
}

public Date getFecha() {
	return fecha;
}

public void setFecha(Date fecha) {
	this.fecha = fecha;
}

public boolean isAceite() {
	return aceite;
}

public void setAceite(boolean aceite) {
	this.aceite = aceite;
}

public boolean isFreno() {
	return freno;
}

public void setFreno(boolean freno) {
	this.freno = freno;
}

public boolean isRevisionMotor() {
	return revisionMotor;
}

public void setRevisionMotor(boolean revisionMotor) {
	this.revisionMotor = revisionMotor;
}

public long getOid() {
	return oid;
}

public void setOid(int oid) {
	this.oid = oid;
}

}