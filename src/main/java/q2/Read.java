package q2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Read {
    public static void main(String[] args) {
        SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Author author1 = session.get(Author.class,1);
        System.out.println(author1.getAge()+" "+author1.getFirstName()+" "+author1.getLastName());

        Author author2 = session.get(Author.class,3);
        System.out.println(author2.getAge()+" "+author2.getFirstName()+" "+author2.getLastName());


        session.getTransaction().commit();
        session.close();
        sessionFactory.close();


    }
}
