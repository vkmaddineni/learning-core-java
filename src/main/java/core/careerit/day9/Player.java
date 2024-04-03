package core.careerit.day9;

import java.sql.SQLOutput;

public class Player {

    private String name,role,country,team;
    private double amount;

    public Player(String name, String role, String country, String team, double amount) {
        this.name = name;
        this.role = role;
        this.country = country;
        this.team = team;
        this.amount = amount;
    }
    public void showDetails() {
        System.out.println(name+","+role+","+amount+","+country+","+team);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getCountry() {
        return country;
    }

    public String getTeam() {
        return team;
    }

    public double getAmount() {
        return amount;
    }
}
