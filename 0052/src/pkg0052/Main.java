
package pkg0052;


   
public class Main {
    public static void main(String[] args) {
       Validation validation = new Validation();
       Manager manager = new Manager();
        while (true) {
            int choice = manager.showMenuAndChoice(); // show menu and choice
            switch (choice) {
                case 1:
                    manager.addContry();
                    break;
                case 2:
                    manager.displayList();
                    break;
                case 3:
                    manager.searchByName();
                    break;
                case 4:
                    manager.SortAcendingbyName();
                    break;
                case 5:
                    return;
            }
        }
       
    }
    
} 
        
    

