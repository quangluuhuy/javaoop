
public class Main {

    public static void main(String[] args) {

        Ultility ultility = new Ultility();
        Controller controller = new Controller();

        while (true) {
            int choice = ultility.showMenu();
            switch (choice) {
                case 1:
                    controller.addWorker();
                    break;
                case 2:
                    controller.updateSalary(1);
                    break;
                case 3:
                    controller.updateSalary(2);
                    break;
                case 4:
                    controller.getInformation();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }

    }
}
