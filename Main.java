import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    VaultManager myVault = new VaultManager();
    boolean running = true;

    while (running) {
      System.out.println("\n1. Add New Password");
      System.out.println("2. View All Passwords");
      System.out.println("3. Exit");
      System.out.print("Choose an option: ");

      int choice = scan.nextInt();
      scan.nextLine();

      if (choice == 1) {
        System.out.print("Enter Website: ");
        String site = scan.nextLine();
        System.out.print("Enter Username: ");
        String user = scan.nextLine();
      }
    }

    scan.close();
  }
}
