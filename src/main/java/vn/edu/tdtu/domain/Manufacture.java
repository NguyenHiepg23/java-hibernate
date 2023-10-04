package vn.edu.tdtu.domain;


import jakarta.persistence.*;
import java.util.List;


@Entity
@Table(name = "Manufacture")
public class Manufacture {
    @Id
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String location;

    @Column(name = "employee")
    private int employee;



    @OneToMany(mappedBy = "manufacture", cascade = CascadeType.ALL)
    private List<Phone> phones;

    public Manufacture() {}
    public Manufacture(String id, String name, String location, int employee) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.employee = employee;
    }
    
    public String getId() {
        return id;
    }
   
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
   
    public void setName(String name) {
        this.name = name;
    }
  
    public String getLocation() {
        return location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public int getEmployee() {
        return employee;
    }
   
    public void setEmployee(int employee) {
        this.employee = employee;
    }
    
    public List<Phone> getPhones() {
        return phones;
    }
    
    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    @Override
	public String toString() {
		return "Manufacture [id=" + id + ", name=" + name + ", location=" + location + ", employee=" + employee + "]";
	} 
}
