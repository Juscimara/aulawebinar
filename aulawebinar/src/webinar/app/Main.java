package webinar.app;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import webinar.dao.InstrutorDao;
import webinar.dao.JPAUtil;
import webinar.model.Aluno;
import webinar.model.Endereco;
import webinar.model.Formacao;
import webinar.model.InscricaoSeminario;
import webinar.model.Instrutor;
import webinar.model.Seminario;

public class Main {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		
		/*Endereco endAluno1 = new Endereco();
		endAluno1.setRua("Rua Jose");
		endAluno1.setCidade("Alfenas");
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Juscimara");
		aluno1.setMatricula("1234");
		aluno1.setEmail("juscimara@unifenas.br");
		aluno1.setEndereco(endAluno1);
		
		em.getTransaction().begin();
		em.persist(endAluno1);
		em.persist(aluno1);
		em.getTransaction().commit();*/
		
		/*Aluno aluno2 = new Aluno("123", "Lucas", new Endereco("Rua 123", "Alfenas"), "lucas@unifenas.br");
		em.getTransaction().begin();
		em.persist(aluno2);
		em.getTransaction().commit();*/
		
		/*Instrutor inst1 = new Instrutor("Lucas", new Endereco("Rua 123", "Alfenas"), "lucas@unifenas.br", 1000, Formacao.JEDI);
		Instrutor inst2 = new Instrutor("Tony Stark", new Endereco("Rua 123", "Alfenas"), "stark@unifenas.br", 1000, Formacao.GRADUADO);
		em.getTransaction().begin();
		em.persist(inst1);
		em.persist(inst2);
		em.getTransaction().commit();
		
		List<Instrutor> instrutores = new ArrayList();
		instrutores.add(inst1);
		instrutores.add(inst2);
		
		Seminario sem1 = new Seminario("Palestra Java", 101, 50, instrutores);
		em.getTransaction().begin();
		em.persist(sem1);
		em.getTransaction().commit();*/
		
		/*Seminario semicon1 = em.find(Seminario.class, 1);
		Aluno alunocon1= em.find(Aluno.class, 1);
		
		InscricaoSeminario inscricao = new InscricaoSeminario(alunocon1, semicon1);
		em.getTransaction().begin();
		em.persist(inscricao);
		em.getTransaction().commit();*/
		
		List<Instrutor> instrutores = new InstrutorDao().getAllByFormacao(Formacao.GRADUADO);
		for (Instrutor instrutor : instrutores) {
			System.out.println(instrutor.getNome());
		}
		
		JPAUtil.shutdown();
	}

}
