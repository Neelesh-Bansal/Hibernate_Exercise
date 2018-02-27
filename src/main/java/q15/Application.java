package q15;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();


        Author author1 = new Author();
        Book book1 = new Book();

        book1.setBookName("Let Us C");
        author1.setBook(book1);
        author1.setFirstName("Neelesh");
        author1.setLastName("Bansal");
        author1.setAge(50);
        author1.setDOB(new Date("27/07/1996"));

        session.save(author1);



        Author author2 = new Author();
        Book book2 = new Book();

        book2.setBookName("Core Java");
        author2.setBook(book2);
        book2.setBookName("Hello Python");
        author2.setBook(book2);
        author2.setFirstName("Sankalp");
        author2.setLastName("Jain");
        author2.setAge(22);
        author2.setDOB(new Date("12/11/1997"));

        session.save(author2);
//        session.save(book1);
//        session.save(book2);





        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
