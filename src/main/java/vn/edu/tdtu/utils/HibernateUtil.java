package vn.edu.tdtu.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import vn.edu.tdtu.domain.Phone;
import vn.edu.tdtu.domain.Manufacture;

public class HibernateUtil {
    private static SessionFactory FACTORY;

    static {
        Configuration conf = new Configuration();
        conf.configure("hibernate.cfg.xml");

        conf.addAnnotatedClass(Manufacture.class);
        conf.addAnnotatedClass(Phone.class);

        ServiceRegistry registry = new StandardServiceRegistryBuilder()
                                        .applySettings(conf.getProperties())
                                        .build();

        FACTORY = conf.buildSessionFactory(registry);
    }

    public static SessionFactory getFactory() {
        return FACTORY;
    }
}
