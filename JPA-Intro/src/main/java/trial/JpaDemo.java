package trial;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaDemo {

	public static void main(String[] args) {

		System.out.println("Start");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnitName");
		EntityManager em = factory.createEntityManager();

//Author1 auth = new Author1(101, "deb","lina","sarkar","6363636");
		Author1 auth2 = new Author1(102, "pad","ma","nava","6363636");
		em.getTransaction().begin();

em.persist(auth2); 

		//auth.setLastName("dutta");

		//em.merge(auth);
		Author1 autData = em.find(Author1.class, 102); // select
		em.getTransaction().commit();
//		em.getTransaction().rollback();
		System.out.println(autData.toString());
		System.out.println("End");
	}
}