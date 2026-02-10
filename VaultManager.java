import java.util.ArrayList;

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
}
