package onetoone;

import onetoone.laptop;
import onetoone.student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.Serializable;

class Main {
    public static void main(String[] args) {
       SessionFactory sf = new Configuration().configure().addAnnotatedClass(Pet.class).addAnnotatedClass(owner.class).buildSessionFactory();
       Session s = sf.openSession();
       Transaction t = s.beginTransaction();
       Pet p = new Pet(7,"bunny",10);
       owner o = new owner(7,"sabari",18,p);
       s.save(p);
       s.save(o);
       owner o1 = s.get(owner.class,7);
       System.out.println(o1.getPet());
       t.commit();

    }
}