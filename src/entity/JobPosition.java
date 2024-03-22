package entity;

public class JobPosition {
    private static int autoId = 100;
    private int id ;
    private String nameJob;
    private Double bonus;

    public JobPosition() {
    }

    public JobPosition(String nameJob, Double bonus) {
        this.id = ++autoId;
        this.nameJob = nameJob;
        this.bonus = bonus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameJob() {
        return nameJob;
    }

    public void setNameJob(String nameJob) {
        this.nameJob = nameJob;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "JobPosition{" +
                "id=" + (++autoId) +
                ", nameJob='" + nameJob + '\'' +
                ", bonus=" + bonus +
                '}';
    }
}
