package q6;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Calendar;

public class Application {

    public static void main(String[] args) {


        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Author author = new Author();
        author.setFirstName("hi");
        author.setLastName("hello");
        author.setAge(21);

        Calendar calendar = Calendar.getInstance();
        calendar.set(1996, 6 , 27);
        author.setDOB(calendar.getTime());
        session.save(author);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
