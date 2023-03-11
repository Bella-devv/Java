package heranca;

public class Teste {

	public static void main(String[] args) {
		
		gerente Pessoa1 = new gerente(" Isabella","2022108203030254" , 6500.50 );
		assistente Pessoa2 = new assistente("Lucas", "123", 1000.00);
		vendedor Pessoa3 = new	vendedor("HEMRIQUE", "321" , 2000);	
		
		System.out.println(Pessoa1.getSalarioBase() + Pessoa2.getSalarioBase() + Pessoa3.getSalarioBase() );

	}

}
