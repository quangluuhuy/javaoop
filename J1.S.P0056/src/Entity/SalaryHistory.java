package Entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SalaryHistory extends Worker implements Comparable<SalaryHistory> {
    
    private String status;
    private LocalDate date;
    
    public SalaryHistory() {
    }
    
    public SalaryHistory(String id, String name, int age, double salary, String workLocation,
            String status, LocalDate date) {
        super(id, name, age, salary, workLocation);
        this.status = status;
        this.date = date;
    }
    
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public LocalDate getDate() {
        return date;
    }
    
    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    @Override
    public int compareTo(SalaryHistory t) {
        return this.getId().compareTo(t.getId());
    }
    
    @Override
    public String toString() {
        return String.format("%-10s%-15s%-15s%-15.0f%-15s%-15s", super.getId(), super.getName(), super.getAge(),super.getSalary(),
                 status,date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
    
}
