package vn.edu.tdtu;


import vn.edu.tdtu.dao.PhoneDAO;
import vn.edu.tdtu.domain.Phone;

public class Program {
    public static void main( String[] args ) {
        PhoneDAO phoneDAO = new PhoneDAO();

        // add phone
        phoneDAO.add(new Phone("p1", "okia", 120, "black", "VietNam", 2));
        phoneDAO.add(new Phone("p2", "iPhone14", 3000, "titan", "USA", 1));

        System.out.println(phoneDAO.get("p1").toString());
    }
}
    