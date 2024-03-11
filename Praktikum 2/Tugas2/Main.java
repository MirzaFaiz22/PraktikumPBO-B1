package Tugas2;
public class Main {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount(1000);
        System.out.println("Saldo sebelum transaksi: " + bank.getBalance());
        System.out.println("Deposit sejumlah " + bank.deposit(500) + " Berhasil. Saldo saat ini " + bank.getBalance());
        System.out.println("Penarikan sejumlah " + bank.withdraw(200) + " Berhasil. Saldo saat ini " + bank.getBalance());
        System.err.println("Saldo setelah transaksi: " + bank.getBalance());
    }
}
