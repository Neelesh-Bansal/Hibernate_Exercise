package q17;

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

        
        //List<Author> authorList1 = new ArrayList<>();
        List<Book> bookList1 = new ArrayList<>();
        //List<Author> authorList2 = new ArrayList<>();
        List<Book> bookList2 = new ArrayList<>();
        List<Book> bookList3 = new ArrayList<>();
        Author author1 = new Author();
        Author author2 = new Author();
        Author author3 = new Author();
        Book book1 = new Book();
        book1.setBookName("Let Us C");
        Book book2 = new Book();
        book2.setBookName("Let Us C++");
        Book book3 = new Book();
        book3.setBookName("Core Java");
        Book book4 = new Book();
        book4.setBookName("Hello Python");

        bookList1.add(book1);
        bookList1.add(book2);
        author1.setBook(bookList1);


        bookList2.add(book2);
        bookList2.add(book3);
        bookList2.add(book4);

        author2.setBook(bookList2);

        bookList3.add(book1);
        bookList3.add(book2);
        bookList3.add(book3);
        bookList3.add(book4);
        author3.setBook(bookList3);


        author1.setFirstName("Neelesh");
        author1.setLastName("Bansal");
        author1.setAge(50);
        author1.setDOB(new Date("27/07/1996"));
        session.save(author1);


        author2.setFirstName("Sankalp");
        author2.setLastName("Jain");
        author2.setAge(22);
        author2.setDOB(new Date("12/11/1997"));
        session.save(author2);

        author3.setFirstName("Ankit");
        author3.setLastName("Gupta");
        author3.setAge(24);
        author3.setDOB(new Date("12/09/1995"));
        session.save(author3);



        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
