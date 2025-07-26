package com.sneha;

import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Alien a1 = null;
       // Alien a2 = new Alien();


        //a1.setAid(104);
        //a1.setAname("Rahul");
        // a1.setTech("Databases");

      /* Configuration config = new Configuration();
        config.addAnnotatedClass(com.sneha.Alien.class);
        config.configure(); */
        SessionFactory factory = new Configuration()
                .addAnnotatedClass(com.sneha.Alien.class)
                .configure()
                .buildSessionFactory();
        Session session = factory.openSession();
        // insertion , deletion and updation need to have a transaction but selection does not need transaction
        Transaction transaction = session.beginTransaction();

       // session.persist(a1);     (for creation)
        //session.merge(a1);           //(for updation)- if the row is not in table it will insert it also

        //a1 = session.find(Alien.class , 101);
        //session.remove(a1);
        //System.out.println(a1);

        a1 = session.find(Alien.class , 101);
        //session.remove(a1);
        System.out.println(a1);
        transaction.commit();

        // a2 = session.get(Alien.class, 103);  (eager fetching)
        //we can use get in 6 version but its deprecated in 7 version for sake of that we can use byId
        //a2 = session.byId(Alien.class).getReference(103);   //lazy fetching
        //System.out.println(a2);
        // get uses eager fetching while byId uses lazy fetching
        //in eager fetching quries are fired without printing while in lazy fetching we need to print
        session.close();

        Session session2 = factory.openSession();
        session2.beginTransaction();

        a1 = session2.find(Alien.class , 101);
        System.out.println(a1);


        session2.getTransaction().commit();
        session2.close();

        factory.close();

    }
}
// pass = Sneha@1203#Kaushik