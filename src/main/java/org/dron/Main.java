package org.dron;

import org.dron.persistence.entities.PaymentAddress;
import org.dron.persistence.entities.Status;
import org.dron.util.HibernateUtil;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        Status status = new Status();
        System.out.println(status);
        PaymentAddress address = new PaymentAddress();
        address.setAddress("Pizza");
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        System.out.println(sessionFactory.isOpen());
        sessionFactory.close();
    }
}
