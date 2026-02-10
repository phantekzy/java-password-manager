# Phantekzy Secure Vault

A terminal-based Password Manager built in Java. This project implements object-oriented programming, secure random password generation, and local file persistence.

## Features
* Secure Storage: Manages password entries in memory using a dynamic ArrayList.
* Local Persistence: Automatically saves and loads data from a local vault.txt file.
* Password Generator: Algorithm to generate 12-character passwords using ASCII complexity.
* Input Validation: Prevents crashes from invalid data types and ensures required fields are populated.
* Colored Interface: Utilizes ANSI escape codes for improved terminal readability and navigation.

## Getting Started

### Prerequisites
* JDK 11 or higher installed.
* Git for version control.

### Installation and Running
1. Clone the repository:
   git clone https://github.com/phantekzy/java-password-manager.git
   cd java-password-manager

2. Compile the source files:
   javac *.java

3. Run the application:
   java Main

## Project Structure
* Main.java: Handles the user interface, menu loops, and input validation.
* VaultManager.java: Manages the logic for storage, file IO, and password generation.
* PasswordEntry.java: The data model representing a single account entry.

## Security Note
The vault.txt file is included in the .gitignore to prevent sensitive data from being pushed to public repositories. Ensure you keep your local vault.txt secure.

## License
This project is open-source and available under the MIT License.
