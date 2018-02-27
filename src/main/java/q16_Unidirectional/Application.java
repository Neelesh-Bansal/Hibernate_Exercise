package q16_Unidirectional;

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
        List<Book> bookList1 = new ArrayList<>();
        Book book1 = new Book();
        Book book2 = new Book();
        book1.setBookName("Let Us C");
        bookList1.add(book1);
        book2.setBookName("Let Us C++");
        bookList1.add(book2);
        author1.setBook(bookList1);
        author1.setFirstName("Neelesh");
        author1.setLastName("Bansal");
        author1.setAge(50);
        author1.setDOB(new Date("27/07/1996"));
        session.save(author1);


        Author author2 = new Author();
        List<Book> bookList2 = new ArrayList<>();
        Book book3 = new Book();
        Book book4 = new Book();
        Book book5 = new Book();
        book3.setBookName("Core Java");
        bookList2.add(book3);
        book4.setBookName("Hello Python");
        bookList2.add(book4);
        book5.setBookName("Harry Porter");
        bookList2.add(book5);
        author2.setBook(bookList2);
        author2.setFirstName("Sankalp");
        author2.setLastName("Jain");
        author2.setAge(22);
        author2.setDOB(new Date("12/11/1997"));
        session.save(author2);



        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
