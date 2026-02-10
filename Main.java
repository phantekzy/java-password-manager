import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  // ANSI Colors for a cooler terminal look
  public static final String RESET = "\u001B[0m";
  public static final String GREEN = "\u001B[32m";
  public static final String RED = "\u001B[31m";
  public static final String CYAN = "\u001B[36m";
  public static final String YELLOW = "\u001B[33m";

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    VaultManager myVault = new VaultManager();
    boolean running = true;

    System.out.println(CYAN + "========================================" + RESET);
    System.out.println(CYAN + "         PHANTEKZY SECURE VAULT       " + RESET);
    System.out.println(CYAN + "========================================" + RESET);

    while (running) {
      System.out.println("\n" + YELLOW + "[ MENU ]" + RESET);
      System.out.println("1.  Add New Password");
      System.out.println("2.  View All Passwords");
      System.out.println("3.  Exit");
      System.out.print(YELLOW + "Choose an option: " + RESET);

      int choice = -1;

      try {
        choice = scanner.nextInt();
        scanner.nextLine(); // Clear buffer
      } catch (InputMismatchException e) {
        System.out.println(RED + "⚠️ Error: Please enter a valid number (1-3)." + RESET);
        scanner.nextLine();
        continue;
      }

      if (choice == 1) {
        String site = "";
        while (site.trim().isEmpty()) {
          System.out.print("Enter Website: ");
          site = scanner.nextLine();
          if (site.trim().isEmpty()) System.out.println(RED + "Website cannot be blank!" + RESET);
        }

        String user = "";
        while (user.trim().isEmpty()) {
          System.out.print("Enter Username: ");
          user = scanner.nextLine();
          if (user.trim().isEmpty()) System.out.println(RED + "Username cannot be blank!" + RESET);
        }

        System.out.print("Use auto-generated password? (y/n): ");
        String auto = scanner.nextLine().toLowerCase();
        String pass = "";

        if (auto.equals("y")) {
          pass = myVault.generateStrongPassword();
          System.out.println(GREEN + "Generated Password: " + pass + RESET);
        } else {
          while (pass.length() < 4) {
            System.out.print("Enter your Password (min 4 chars): ");
            pass = scanner.nextLine();
            if (pass.length() < 4) System.out.println(RED + "Password too short!" + RESET);
          }
        }

        myVault.addEntry(new PasswordEntry(site, user, pass));
        System.out.println(GREEN + " Saved to Vault!" + RESET);

      } else if (choice == 2) {
        myVault.viewPasswords();
      } else if (choice == 3) {
        running = false;
        System.out.println(CYAN + " Vault Locked. Goodbye!" + RESET);
      } else {
        System.out.println(RED + " Invalid choice. Select 1, 2, or 3." + RESET);
      }
    }
    scanner.close();
  }
}
