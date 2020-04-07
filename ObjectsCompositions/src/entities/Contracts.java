package entities;

import java.util.Date;

public class Contracts {
    private Date date;
    private Double valueHour;
    private Integer hours;

    public Contracts(Date date, Double valueHour, Integer hours) {
        this.date = date;
        this.valueHour = valueHour;
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Contracts{" +
                "date=" + date +
                ", valueHour=" + valueHour +
                ", hours=" + hours +
                '}';
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValueHour() {
        return valueHour;
    }

    public void setValueHour(Double valueHour) {
        this.valueHour = valueHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double totalValue(){
        return this.valueHour * this.hours;
    }
}
