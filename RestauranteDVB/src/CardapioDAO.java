import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CardapioDAO {
	
	public void incluir(CardapioTO to) {
		String sqlInsert = "INSERT INTO cliente(idProduto, nomeProduto, descProduto,valorProduto,dispProduto ) VALUES (?, ?, ?, ?, ?)";
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlInsert);) {
			stm.setInt(1, to.getIdProduto());
			stm.setString(2, to.getNomeProduto());
			stm.setString(3, to.getDescProduto());
			stm.setDouble(4, to.getValorProduto());
			stm.setString(5, to.getDispProduto());
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void atualizar(CardapioTO to) {
		String sqlUpdate = "UPDATE cardapio SET nomeProduto=?, fone=? WHERE idProduto=?";
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlUpdate);) {
			stm.setInt(1, to.getIdProduto());
			stm.setString(2, to.getNomeProduto());
			stm.setString(3, to.getDescProduto());
			stm.setDouble(4, to.getValorProduto());
			stm.setString(5, to.getDispProduto());
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void excluir(CardapioTO to) {
		String sqlDelete = "DELETE FROM cardapio WHERE idProduto = ?";
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlDelete);) {
			stm.setInt(1, to.getIdProduto());
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public CardapioTO carregar(int id) {
		CardapioTO to = new CardapioTO();
		String sqlSelect = "SELECT nomeProduto, descProduto,valorProduto,dispProduto  FROM cliente WHERE cliente.idProduto = ?";
		try (Connection conn = ConnectionFactory. obtemConexao();
		PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
		stm.setInt(1, id);
		try (ResultSet rs = stm.executeQuery();) {
		if (rs.next()) {
		to.setNomeProduto(rs.getString("nomeProduto"));
		to.setDescProduto(rs.getString("descProduto"));
		to.setValorProduto(rs.getDouble("valorProduto"));
		to.setDispProduto(rs.getString("dispProduto"));
		
		}
		} catch (SQLException e) {
		e.printStackTrace();
		}
		} catch (SQLException e1) {
		System. out.print(e1.getStackTrace());
		}
		return to;
		}
}