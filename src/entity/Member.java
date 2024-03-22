package entity;

public class Member {
    private Human human;
    private static int autoId = 100 ;
    private int id;
    private double wage;

    public Member() {
    }

    public Member(Human human,  double wage) {
        this.human = human;
        this.id = ++autoId ;
        this.wage = wage;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Member{" +
                "human=" + human +
                ", id=" + (++autoId) +
                ", wage=" + wage +
                '}';
    }
}
