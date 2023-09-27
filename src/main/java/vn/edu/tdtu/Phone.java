package vn.edu.tdtu;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn; 
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;



@Entity
@Table(name = "MobilePhone")
public class Phone {
    @Id
    private String ID;

    @Column
    private String Name;

    @Column
    private int Price;

    @Column
    private String Color;

    @Column 
    private String Country;

    @Column
    private int Quantity;


    public Phone() {};
    public Phone(String ID, String Name, int Price, String Color, String Country, int Quantity) {
        this.ID = ID;
        this.Name = Name;
        this.Price = Price;
        this.Color = Color;
        this.Country = Country;
        this.Quantity = Quantity;
    }

    @ManyToOne
    @JoinColumn(name = "ID")
    private Manufacture manufacture;
}   
