package trabalhandojava.dio;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livros livros = new Livros();
		System.out.println(gato);
		System.out.println(livros);
		
		/*int a = 5;
		int b = 9;
		System.out.println("Olá, seja bem vindo ao meu primeiro programa em JAVA! " + "Version:" + (2*a-b));*/		

	}

}

class Livros{
	
	private String nome;
	private String npag;
}
