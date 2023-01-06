package br.com.alura.loja.testes;

import br.com.alura.loja.dao.CategoriaDAO;
import br.com.alura.loja.dao.ProdutoDAO;
import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.modelo.Produto;
import br.com.alura.loja.util.JPAUtil;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;

public class CadastroDeProdutos {
    public static void main(String[] args) {
        //cadastroDeProdutos();
        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDAO pd = new ProdutoDAO(em);
        Produto p = pd.buscarPorId(1L);
        //System.out.println(p.getPreco());

        //List<Produto> todos = pd.buscarTodos();
       //List<Produto> buscarPornome = pd.buscarPorNome("Xiomi Redmi");
       // List<Produto> buscarPorCategoria = pd.buscarPorCategoria("CELULAR");
       // buscarPorCategoria.forEach(p2 -> System.out.println(p.getCategoria().getNome()));
        BigDecimal produtoPreco = pd.buscarPrecoDoProduto("Moto E7");
        System.out.println(produtoPreco);


}

//	private static void cadastroDeProdutos() {
//		Categoria celulares = new Categoria("CELULAR");
//		Produto celular = new Produto("Moto e7", "Muito Legal",
//				  new BigDecimal("800"), celulares);
//
//		EntityManager em = JPAUtil.getEntityManager();
//		em.getTransaction().begin();
//		em.persist(celular);
//        em.getTransaction().commit();
//		em.close();
////		celulares.setNome("XPTO");
////		em.flush();
////		em.clear();
////
////		celulares = em.merge(celulares);
////		celulares.setNome("1234");
////		em.flush();
////
////		em.remove(celulares);
////		em.flush();
//
////		ProdutoDAO produtoDao = new ProdutoDAO(em);
////		CategoriaDAO categoriaDAO = new CategoriaDAO(em);
////
////		categoriaDAO.cadastrar(celulares);
////		produtoDao.cadastrar(celular);
////
//		em.getTransaction().commit();
//		em.close();
//	}
}
