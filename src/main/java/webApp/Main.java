package webApp;

import org.hibernate.Session;

import webApp.SesionFactoryHibernate.MySesionFactory;
import webApp.entity.TestHibernate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("qwe");
	Session sesion=MySesionFactory.getSessionFactory().openSession();
	sesion.beginTransaction();
	sesion.save(new TestHibernate("root","root"));
	sesion.close();
	}

}
