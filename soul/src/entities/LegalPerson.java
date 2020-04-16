package entities;

import entities.enums.Occupation;

import java.util.Date;

public class LegalPerson {
    private Integer id;
    private String name;
    private Integer cpf;
    private Date dateRegistered;
    private Integer cellphone;
    private Occupation occupation;
    private Boolean donorPerson;

    @Override
    public String toString() {
        return "LegalPerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cpf=" + cpf +
                ", dateRegistered=" + dateRegistered +
                ", cellphone=" + cellphone +
                ", occupation=" + occupation +
                ", donorPerson=" + donorPerson +
                '}';
    }

    public LegalPerson(Integer id, String name, Integer cpf, Date dateRegistered, Integer cellphone, Occupation occupation, Boolean donorPerson) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.dateRegistered = dateRegistered;
        this.cellphone = cellphone;
        this.occupation = occupation;
        this.donorPerson = donorPerson;
    }

    public LegalPerson() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Date getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public Integer getCellphone() {
        return cellphone;
    }

    public void setCellphone(Integer cellphone) {
        this.cellphone = cellphone;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }

    public Boolean getDonorPerson() {
        return donorPerson;
    }

    public void setDonorPerson(Boolean donorPerson) {
        this.donorPerson = donorPerson;
    }
}