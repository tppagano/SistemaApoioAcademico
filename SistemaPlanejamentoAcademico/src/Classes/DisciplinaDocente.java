package Classes;

public class DisciplinaDocente {

	Docente docente;
	Disciplina disciplina;
	long horaIni;
	long hohaFim;
	public DisciplinaDocente(Docente docente, Disciplina disciplina, long horaIni, long hohaFim) {
		super();
		this.docente = docente;
		this.disciplina = disciplina;
		this.horaIni = horaIni;
		this.hohaFim = hohaFim;
	}
	public Docente getDocente() {
		return docente;
	}
	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}


	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public long getHoraIni() {
		return horaIni;
	}
	public void setHoraIni(long horaIni) {
		this.horaIni = horaIni;
	}
	public long getHohaFim() {
		return hohaFim;
	}
	public void setHohaFim(long hohaFim) {
		this.hohaFim = hohaFim;
	}
	
}
