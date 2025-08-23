public class BankAccount {
    private int accountNumber;
   private String accountHolderName;
   private long balance;

   public BankAccount(int accountNumber, String accountHolderName) {
      this.accountHolderName = accountHolderName;
      this.accountNumber = accountNumber;
   }

   public void deposit(long depositAmount) {
      if (depositAmount <= 0L) {
         System.out.println("Deposition of Money Falied due to Invalid Deposition Amount!!");
      } else {
         this.balance += depositAmount;
         System.out.printf("%dRs. Deposited!!\n", depositAmount);
      }

   }

   public long withdraw(long withdawAmount) {
      if (withdawAmount > this.balance) {
         System.out.println("Withdrawal of Money Failed due to insufficient Balance!!");
      } else if (withdawAmount <= 0L) {
         System.out.printf("Withdrawal of Money Failed due to Invalid Withdrawal Amount!!\n");
      } else {
         this.balance -= withdawAmount;
         System.out.printf("%dRs. Withdrawed!!\n");
      }

      return withdawAmount;
   }
}
