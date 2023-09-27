package vn.edu.tdtu;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;




@Entity
@Table(name = "Manufacture")
public class Manufacture {
    @Id
    private String ID;

    @Column
    private String Name;

    @Column 
    private String Location;

    @Column
    private int Employee;

    
}
