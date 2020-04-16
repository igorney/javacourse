package entities;

import java.util.Date;

public class PhysicalPerson {
    private Integer id;
    private String namePhysical;
    private Date dateRegistered;
    private Integer CNPJ;
    private String country;
    private String city;
    private String state;

    @Override
    public String toString() {
        return "PhysicalPerson{" +
                "id=" + id +
                ", namePhysical='" + namePhysical + '\'' +
                ", dateRegistered=" + dateRegistered +
                ", CNPJ=" + CNPJ +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public PhysicalPerson() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamePhysical() {
        return namePhysical;
    }

    public void setNamePhysical(String namePhysical) {
        this.namePhysical = namePhysical;
    }

    public Date getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public Integer getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(Integer CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public PhysicalPerson(Integer id, String namePhysical, Date dateRegistered, Integer CNPJ, String country, String city, String state) {
        this.id = id;
        this.namePhysical = namePhysical;
        this.dateRegistered = dateRegistered;
        this.CNPJ = CNPJ;
        this.country = country;
        this.city = city;
        this.state = state;
    }
}