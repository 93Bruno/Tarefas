import java.io.Serializable;

@SuppressWarnings("serial")
public class Cardapio implements Serializable {
	private int idProduto;
	private String nomeProduto;
	private String descProduto;
	private double valorProduto;
	private String dispProduto;

	public Cardapio(int idProduto, String nomeProduto, String descProduto,
			double valorProduto, String dispProduto) {
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

	public void incluir() {
		CardapioDAO dao = new CardapioDAO();
		CardapioTO to = new CardapioTO();
		to.setIdProduto(idProduto);
		to.setNomeProduto(nomeProduto);
		to.setDescProduto(descProduto);
		to.setValorProduto(valorProduto);
		to.setDispProduto(dispProduto);
		dao.incluir(to);
	}

	public void atualizar() {
		CardapioDAO dao = new CardapioDAO();
		CardapioTO to = new CardapioTO();
		to.setIdProduto(idProduto);
		to.setNomeProduto(nomeProduto);
		to.setDescProduto(descProduto);
		to.setValorProduto(valorProduto);
		to.setDispProduto(dispProduto);
		dao.atualizar(to);
	}

	public void excluir() {
		CardapioDAO dao = new CardapioDAO();
		CardapioTO to = new CardapioTO();
		to.setIdProduto(idProduto);
		dao.excluir(to);
	}

	public void carregar() {
		CardapioDAO dao = new CardapioDAO();
		CardapioTO to = dao.carregar(idProduto);
		idProduto = to.getIdProduto();
		nomeProduto = to.getNomeProduto();
		descProduto = to.getDescProduto();
		valorProduto = to.getValorProduto();
		dispProduto = to.getDispProduto();
		
	}
}
