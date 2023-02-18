package exercicio1;

public class Fatura {
	
		private String numero, descricao;
		private int quantidade;
		private double preco, totalFatura;
		
		
		public double getTotalFatura() {	
			double valorFatura = (quantidade*preco);
			if(valorFatura <0) {
				valorFatura = 0;	
			}else if(valorFatura>0){
				valorFatura = (quantidade*preco);
			}else if(preco<0) {
				preco = 0.0;
			}else if(preco>0) {
				valorFatura = (quantidade*preco);
			}
			return valorFatura;
		}
		public Fatura(String numero, String descricao, int quantidade, double preco) {
			super();
			this.numero = numero;
			this.descricao = descricao;
			this.quantidade = quantidade;
			this.preco = preco;
		}
		public String getNumero() {
			return numero;
		}
		public void setNumero(String numero) {
			this.numero = numero;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public int getQuantidade() {
			return quantidade;
		}
		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}
		public double getPreco() {
			return preco;
		}
		public void setPreco(double preco) {
			this.preco = preco;
		}
		
	
		

	}


