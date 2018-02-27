package q4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Calendar;


public class Create {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();


        Author author1 = new Author();
        author1.setFirstName("hello");
        author1.setLastName("world");
        author1.setAge(50);
        calendar.set(1970, 0 , 19);
        author1.setDOB(calendar.getTime());
        session.save(author1);



        Author author2 = new Author();
        author2.setFirstName("Sankalp");
        author2.setLastName("Jain");
        author2.setAge(22);
        calendar.set(1996, 4 , 20);
        author2.setDOB(calendar.getTime());
        session.save(author2);


        Author author3 = new Author();
        author3.setFirstName("Ankit");
        author3.setLastName("Gupta");
        author3.setAge(25);
        calendar.set(1992, 9 , 17);
        author3.setDOB(calendar.getTime());
        session.save(author3);


        Author author4 = new Author();
        author4.setFirstName("Nakul");
        author4.setLastName("Bansal");
        author4.setAge(20);
        calendar.set(1997, 5 , 27);
        author4.setDOB(calendar.getTime());
        session.save(author4);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

    }
}
