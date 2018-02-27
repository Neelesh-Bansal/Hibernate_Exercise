package q2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Create {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();


        Author author1 = new Author();
        author1.setFirstName("Neelesh");
        author1.setLastName("Bansal");
        author1.setAge(21);
        session.save(author1);


        Author author2 = new Author();
        author2.setFirstName("Sankalp");
        author2.setLastName("Jain");
        author2.setAge(22);
        session.save(author2);


        Author author3 = new Author();
        author3.setFirstName("Ankit");
        author3.setLastName("Gupta");
        author3.setAge(25);
        session.save(author3);


        Author author4 = new Author();
        author4.setFirstName("Nakul");
        author4.setLastName("Bansal");
        author4.setAge(20);
        session.save(author4);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

    }
}
