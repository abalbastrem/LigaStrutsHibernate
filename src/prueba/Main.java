package prueba;

import java.util.List;

import org.hibernate.Session;

public class Main {

	public void insert(Persona p){

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.persist(p);
		session.getTransaction().commit();
		session.close();
		
	}
	
	
	public static void main(String[] args) {
		
		
		
	}

}



















