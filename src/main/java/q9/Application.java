package q9;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Calendar;
import java.util.Date;

public class Application {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();


        Author author1 = new Author();
        author1.setFirstName("hello1");
        author1.setLastName("world");
        author1.setAge(50);
        //calendar.set(new Date("12/11/1998"));
        author1.setDOB(new Date("12/11/1997"));
        session.save(author1);



        Author author2 = new Author();
        author2.setFirstName("Sankalp");
        author2.setLastName("Jain");
        author2.setAge(22);
        //calendar.set(new Date("21/02/1995"));
        author2.setDOB(new Date("12/11/1997"));
        session.save(author2);


        Author author3 = new Author();
        author3.setFirstName("Ankit");
        author3.setLastName("Gupta");
        author3.setAge(25);
        //calendar.set(new Date("17/06/1994"));
        author3.setDOB(new Date("12/11/1997"));
        session.save(author3);


        Author author4 = new Author();
        author4.setFirstName("Nakul");
        author4.setLastName("Bansal");
        author4.setAge(20);
        //calendar.set(new Date("22/11/1999"));
        author4.setDOB(new Date("12/11/1997"));
        session.save(author4);


        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
