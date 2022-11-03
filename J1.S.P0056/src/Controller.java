
import Entity.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Controller {

    Ultility ultility = new Ultility();
    private final List<Worker> workerList;
    private final List<SalaryHistory> salaryHistoryList;
    public Scanner sc = new Scanner(System.in);

    public Controller() {
        workerList = new ArrayList<>();
        salaryHistoryList = new ArrayList<>();
    }

    public void addWorker() {
        System.out.println("--------- Add Worker ---------");
        String id = ultility.getCode("Enter Code: ", "ID must be unique and can not null", workerList, 1);
        String name = ultility.getString("Enter Name: ");
        int age = ultility.getInt("Enter Age: ", 18, 50);
        double salary = ultility.getDouble("Enter Salary: ", 0, Double.MAX_VALUE);
        String workLocation = ultility.getString("Enter work location: ");

        Worker newWorker = new Worker(id, name, age, salary, workLocation);
        workerList.add(newWorker);
        System.err.println("Add successfull");
    }

    public void updateSalary(int mode) {
        if (workerList.isEmpty()) {
            System.err.println("List is empty");
        } else {
            String id;
            Worker worker;
            while (true) {
                id = ultility.getString("Enter Code:");
                if (!id.isEmpty()) {
                    worker = ultility.getWorkerInList(id, workerList);
                    if (worker != null) {
                        break;
                    } else {
                        System.err.println("Worker does not exist!");
                    }
                } else {
                    System.err.println("Id must not be empty!");
                }
            }

            double money;

            String status = "";
            if (mode == 1) {
                double newSalary;
                money = ultility.getDouble("Enter Salary: ", 0, Double.MAX_VALUE);
                newSalary = worker.getSalary() + money;
                worker.setSalary(newSalary);
                status = "UP";
                salaryHistoryList.add(new SalaryHistory(id, worker.getName(), worker.getAge(), worker.getSalary(),
                        worker.getWorkLocation(), status, LocalDate.now()));
                System.err.println("Update successfull");
            } else if (mode == 2) {
                double newSalary = 0;
                money = ultility.getDouble("Enter Salary: ", 0, worker.getSalary());
                newSalary = worker.getSalary() - money;
                worker.setSalary(newSalary);
                status = "DOWN";
                salaryHistoryList.add(new SalaryHistory(id, worker.getName(), worker.getAge(), worker.getSalary(),
                        worker.getWorkLocation(), status, LocalDate.now()));
                System.err.println("Update successfull");
            }

        }
    }

    public void getInformation() {
        if (salaryHistoryList.isEmpty()) {
            System.err.println("List is empty!!");
        } else {
            System.out.println("------------------------Display Information Salary------------------------");
            System.out.format("%-10s%-15s%-15s%-15s%-15s%s", "Code", "Name", "Age", "Salary", "Status", "Date\n");
            Collections.sort(salaryHistoryList);
//            int size = salaryHistoryList.size();
//            for (int i = 0; i < size; i++) {
//                for (int j = i + 1; j < size; j++) {
//                    if (salaryHistoryList.get(i).getId().equals(salaryHistoryList.get(j).getId())) {
//                        if (salaryHistoryList.get(i).getSalary() > salaryHistoryList.get(j).getSalary()) {
//                            Collections.swap(salaryHistoryList, i, j);
//                        }
//                    }
//                }
//
//            }
            for (SalaryHistory o : salaryHistoryList) {
                System.out.println(o);
            }
        }
    }

    public SalaryHistory getWorkerInList(String id) {
        for (SalaryHistory o : salaryHistoryList) {
            if (o.getId().equalsIgnoreCase(id)) {
                return o;
            }
        }
        return null;
    }

}
