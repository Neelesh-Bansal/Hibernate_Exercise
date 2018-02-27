package q3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.criteria.internal.expression.function.CurrentDateFunction;

import java.util.Calendar;

public class AddField {

    public static void main(String[] args) {


        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Author author = new Author();
        author.setFirstName("Neelesh");
        author.setLastName("Bansal");
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
