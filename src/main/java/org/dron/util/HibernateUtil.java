package org.dron.util;


import lombok.NoArgsConstructor;
import org.apache.logging.log4j.core.Logger;
import org.dron.persistence.entities.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

@NoArgsConstructor
public class HibernateUtil {
    private static SessionFactory sessionFactory;
    Logger logger = Logger.

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();
                configuration.configure();
                configuration.addAnnotatedClass(Payment.class);
                configuration.addAnnotatedClass(PaymentAddress.class);
                configuration.addAnnotatedClass(Status.class);
                configuration.addAnnotatedClass(Template.class);
                configuration.addAnnotatedClass(User.class);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());

            } catch (Exception e) {
                System.out.println("Исключение!" + e);
            }
        }
        return sessionFactory;
    }
}
