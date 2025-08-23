public class Customer {
    public Customer() {
    }

    public static void main(String[] args) {
        /*
         * 60. Define a BankAccount class with private attributes like
         * accountNumber, accountHolderName, and balance. Provide
         * public methods to deposit and withdraw money, ensuring that
         * these methods don't allow illegal operations like withdrawing
         * more money than the current balance.
         */
        BankAccount customer1 = new BankAccount(1233, "Sushil");
        customer1.deposit(100L);
        System.out.println(customer1.withdraw(200L));
        customer1.deposit(-40L);
        customer1.withdraw(0L);
    }
}
