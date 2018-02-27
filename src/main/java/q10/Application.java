package q10;

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
        author1.setFirstName("Neelesh");
        author1.setLastName("Bansal");
        author1.setAge(50);
        //calendar.set(new Date("12/11/1998"));
        author1.setDOB(new Date("12/11/1997"));
        Address address = new Address();
        address.setStreetNumber(12);
        address.setLocation("Anoopshahr");
        address.setState("UP");
        author1.setAddress(address);
        session.save(author1);



        Author author2 = new Author();
        author2.setFirstName("Sankalp");
        author2.setLastName("Jain");
        author2.setAge(22);
        //calendar.set(new Date("21/02/1995"));
        author2.setDOB(new Date("12/11/1997"));
        Address address2 = new Address();
        address2.setStreetNumber(12);
        address2.setLocation("Pari Chowk");
        address2.setState("UP");
        author2.setAddress(address2);
        session.save(author2);


        Author author3 = new Author();
        author3.setFirstName("Ankit");
        author3.setLastName("Gupta");
        author3.setAge(25);
        //calendar.set(new Date("17/06/1994"));
        author3.setDOB(new Date("12/11/1997"));
        Address address3 = new Address();
        address3.setStreetNumber(12);
        address3.setLocation("Rohini Sec-3");
        address3.setState("Delhi");
        author3.setAddress(address3);
        session.save(author3);


        Author author4 = new Author();
        author4.setFirstName("Nakul");
        author4.setLastName("Bansal");
        author4.setAge(20);
        //calendar.set(new Date("22/11/1999"));
        author4.setDOB(new Date("12/11/1997"));
        Address address4 = new Address();
        address4.setStreetNumber(12);
        address4.setLocation("Narnaul");
        address4.setState("Haryana");
        author4.setAddress(address4);
        session.save(author4);


        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
