
public class CardapioService {

	CardapioDAO dao;

	public CardapioService() {
		dao = new CardapioDAO();
	}

	public void criar(CardapioTO to) {
		dao.incluir(to);
	}

	public void atualizar(CardapioTO to) {
		dao.atualizar(to);
	}

	public void excluir(CardapioTO to) {
		dao.excluir(to);
	}

	public Cardapio carregar(int idProduto) {

		CardapioTO to = dao.carregar(idProduto);
		return to;
	}

	@Override
	public String toString() {
		return "Cardapio [id=" + idProduto + ", nome=" + nomeProduto + ", descrição=" + descProduto + ", valor="
				+ valorProduto + ", disponibilidade" + dispProduto + " ]";
	}
}
