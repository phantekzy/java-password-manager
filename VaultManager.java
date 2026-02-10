import java.util.ArrayList;
import java.util.Random;

public class VaultManager {
  private ArrayList<PasswordEntry> vault = new ArrayList<>();

  public void addEntry(PasswordEntry entry) {
    vault.add(entry);
  }

  public void viewPasswords() {
    if (vault.isEmpty()) {
      System.out.println("\n[!] Your vault is empty.");
    } else {
      System.out.println("\n--- YOUR SECURE PASSWORDS ---");
      for (PasswordEntry p : vault) {
        System.out.println(
            "Site: "
                + p.getWebsite()
                + " | User: "
                + p.getUsername()
                + " | Pass: "
                + p.getPassword());
      }
    }
  }

  public String generateStrongPassword() {
    String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
    StringBuilder sb = new StringBuilder();
    Random rand = new Random();

    for (int i = 0; i < 12; i++) {
      sb.append(chars.charAt(rand.nextInt(chars.length())));
    }
    return sb.toString();
  }
}
