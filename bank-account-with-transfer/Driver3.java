public class Driver3 {
    public static void main(String[] args) {
        BankAccount tom = new BankAccount("Tom");
        tom.deposit(5000.0);
        BankAccount sandy = new BankAccount("Sandy");
        sandy.deposit(8000.0);
        tom.transfer(2000, sandy);
        sandy.withdraw(500.0);
        sandy.withdraw(600.0);
        System.out.println(sandy.getBalance());
    }
}
