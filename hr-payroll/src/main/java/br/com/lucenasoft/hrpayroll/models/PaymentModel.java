package br.com.lucenasoft.hrpayroll.models;

public class PaymentModel {
    private String name;
    private Double dailyIncome;
    private Integer days;

    public PaymentModel(){}

    public PaymentModel(String name, Double dailyIncome, Integer days) {
        this.name = name;
        this.dailyIncome = dailyIncome;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDailyIncome() {
        return dailyIncome;
    }

    public void setDailyIncome(Double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public double getTotal() {
        return days * dailyIncome;
    }
}
