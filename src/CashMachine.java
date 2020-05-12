import java.util.Scanner;

public class CashMachine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Wpisz swoje imię:");
        String firstName = sc.nextLine();

        System.out.println("Wpisz swoje nazwisko:");
        String lastName = sc.nextLine();

        System.out.println("Wpisz swoj pesel:");
        int pesel = sc.nextInt();

        System.out.println("Jaką sumę pieniędzy chcesz wpłacić na konto?:");
        double deposit = sc.nextDouble();

        System.out.println("Jaką sumę pieniędzy chcesz wypłacić z konta?:");
        double withdraw = sc.nextDouble();

        try {
            BankAccount newBankAccount = new BankAccount(0.0,
                    new Person(firstName, lastName, pesel));
            newBankAccount.deposit(1000);
            newBankAccount.withdraw(500);
        } catch (NullPointerException e) {
            System.out.println("Brak danych osobowych,wpisz dane osobowe:");
        } catch (LackOfAccountFunds e) {
            System.out.println("Nie msz środków na koncie! ");
        } catch (TooMuchAmount e) {
            System.out.println("Nie możesz jednorazowo wybrać więcej niż 1000 zł ");
        }
    }
}
