package projeto;

public class Conteudo {
	
		private String titulo;
		private String urlImagem;
		
		// Constructor
		public Conteudo(String titulo, String urlImagem) {
			this.titulo = titulo;
			this.urlImagem = urlImagem;
		}
		
		// Getters and Setters
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getUrlImagem() {
			return urlImagem;
		}
		public void setUrlImagem(String urlImagem) {
			this.urlImagem = urlImagem;
		}
		
		
}
