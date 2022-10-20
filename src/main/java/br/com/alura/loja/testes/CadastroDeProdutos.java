package br.com.alura.loja.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import br.com.alura.loja.dao.ProdutoDAO;
import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.modelo.Produto;
import br.com.alura.loja.util.JPAUtil;

public class CadastroDeProdutos {
	public static void main(String[] args) {

		Produto celular = new Produto("Xiomi Redmi", "Muito Legal", new BigDecimal("800"), Categoria.CELULARES);
	
		EntityManager em = JPAUtil.getEntityManager();

		
		em.getTransaction().begin();
		ProdutoDAO dao = new ProdutoDAO(em);
		dao.cadastrar(celular);
		em.getTransaction().commit();
		em.close();
	}
}
