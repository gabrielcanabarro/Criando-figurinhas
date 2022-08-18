package projeto;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class App {

	public static void main(String[] args) throws Exception {
		
		// fazer uma conexao HTTP
		
		String url = "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&start_date=2022-06-12&end_date=2022-06-14";
		var http = new ClienteHttp();
		String json = http.buscaDados(url);
		
		
		// exibir e manipular os dados
		ExtratorDeConteudoDaNasa extrator = new ExtratorDeConteudoDaNasa();
		List<Conteudo> conteudos = extrator.extraiConteudos(json);
		
		var geradora = new GeradoraDeFigurinhas();
		for (int i=0; i < 3; i++) {
			Conteudo conteudo = conteudos.get(i);
			
			
			InputStream inputStream = new URL(conteudo.getUrlImagem()).openStream();
			String nomeArquivo = conteudo.getTitulo() + ".png";
			
			geradora.cria(inputStream, nomeArquivo);
			
			System.out.println(conteudo.getTitulo());
			System.out.println();
			}

	}

}
