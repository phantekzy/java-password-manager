import java.util.ArrayList;

public class VaultManager {
  private ArrayList<PasswordEntry> vault = new ArrayList<>();

  public void addEntry(PasswordEntry entry) {
    vault.add(entry);
  }
}
