package vn.edu.tdtu;

import com.mysql.cj.xdevapi.SessionFactory;

public class HibernateUtil {
    private final static SessionFactory FACTORY;

    static {
        
    }

    public static SessionFactory getSessionFactory() {
        return FACTORY;
    }
}
