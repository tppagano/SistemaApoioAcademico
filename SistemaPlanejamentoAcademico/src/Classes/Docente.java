package Classes;

public class Docente {

		String nomedo;
		public String getNomedo() {
			return nomedo;
		}
		public void setNomedo(String nomedo) {
			this.nomedo = nomedo;
		}
		String id;    //siap 
		public Docente(String nomedo ,String id )
		{
		this.nomedo=nomedo;
		this.id=id;
		}
		public String getNome() {
			return nomedo;
		}
		public void setNome(String nomedo) {
			this.nomedo = nomedo;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}	
}
