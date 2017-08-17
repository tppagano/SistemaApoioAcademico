package Classes;

public class Disciplina {
	String nomedi;
	Integer sementre;
	Integer cargoHorario;
	public Disciplina(String nomedi, Integer sementre, Integer cargoHorario) {
		this.nomedi = nomedi;
		this.sementre = sementre;
		this.cargoHorario = cargoHorario;
	}
	public String getNomedi() {
		return nomedi;
	}
	public void setNomedi(String nomedi) {
		this.nomedi = nomedi;
	}
	public Integer getSementre() {
		return sementre;
	}
	public void setSementre(Integer sementre) {
		this.sementre = sementre;
	}
	public Integer getCargoHorario() {
		return cargoHorario;
	}
	public void setCargoHorario(Integer cargoHorario) {
		this.cargoHorario = cargoHorario;
	}
	
}
