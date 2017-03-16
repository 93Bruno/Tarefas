
public class CardapioTO {
	
		private int idProduto;
		private String nomeProduto;
		private String descProduto;
		private double valorProduto;
		private String dispProduto;
		
		public CardapioTO(){}
		
		public CardapioTO(int idProduto, String nomeProduto, String descProduto, double valorProduto, String dispProduto ){
			this.idProduto = idProduto;
			this.nomeProduto = nomeProduto;
			this.descProduto = descProduto;
			this.valorProduto = valorProduto;
			this.dispProduto = dispProduto;
		}
		public int getIdProduto() {
			return idProduto;
		}

		public void setIdProduto(int idProduto) {
			this.idProduto = idProduto;
		}

		public String getNomeProduto() {
			return nomeProduto;
		}

		public void setNomeProduto(String nomeProduto) {
			this.nomeProduto = nomeProduto;
		}

		public String getDescProduto() {
			return descProduto;
		}

		public void setDescProduto(String descProduto) {
			this.descProduto = descProduto;
		}

		public double getValorProduto() {
			return valorProduto;
		}

		public void setValorProduto(double valorProduto) {
			this.valorProduto = valorProduto;
		}

		public String getDispProduto() {
			return dispProduto;
		}

		public void setDispProduto(String dispProduto) {
			this.dispProduto = dispProduto;
		}
	}

