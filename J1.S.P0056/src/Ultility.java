
import Entity.Worker;
import java.util.List;
import java.util.Scanner;

public class Ultility {

    public static Scanner sc = new Scanner(System.in);

    public int showMenu() {
        System.out.println("======== Worker Management ========");
        System.out.println("1. Add Worker");
        System.out.println("2. Up salary");
        System.out.println("3. Down salary");
        System.out.println("4. Display Information salary");
        System.out.println("5. Exit");
        int choice = getInt("Enter choice:", 1, 5);
        return choice;
    }

    public int getInt(String msg, int min, int max) {
        int input = 0;
        while (true) {
            try {
                System.out.print(msg);
                input = Integer.parseInt(sc.nextLine());
                if (input >= min && input <= max) {
                    break;
                }else {
                    System.err.println("Please Enter number in range:"+ "["+min+"-"+max+"]");
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid input, please input again");
            }
        }
        return input;
    }

    public double getDouble(String msg, double min, double max) {
        double input = 0;
        while (true) {
            try {
                System.out.print(msg);
                input = Double.parseDouble(sc.nextLine());
                if (input >= min && input <= max) {
                    break;
                } else {
                    System.err.println("Please Enter number in range:"+ "["+(int)min+"-"+(int)max+"]");
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid input, please input again");
            }
        }
        return input;
    }

    public String getString(String msg) {
        String name;
        while (true) {
            System.out.print(msg);
            name = sc.nextLine().trim();
            if (!name.equals("")) {
                break;
            } else {
                System.err.println(msg + " must not be empty");
            }
        }
        return name;
    }

    public String getCode(String msg, String err, List<Worker> list, int mode) {
        String code;
        while (true) {
            System.out.print(msg);
            code = sc.nextLine();
            if (!code.isEmpty()) {
                if ((mode == 1 && getWorkerInList(code, list) == null)
                        || (mode == 2 && getWorkerInList(code, list) != null)) {
                    break;
                }
            }
            System.err.println(err);
        }
        return code;
    }
    
    public Worker getWorkerInList(String id, List<Worker> list) {
        for (Worker o : list) {
            if (o.getId().equalsIgnoreCase(id)) {
                return o;
            }
        }
        return null;
    }
}
