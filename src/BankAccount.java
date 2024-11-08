public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        if (sum > 0) {
            amount += sum;
            System.out.println("Сумма " + sum + " успешно зачислена на счет.");
        }
    }

    public void withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Недостаточно средств на счете для снятия.", amount);
        }
        amount -= sum;
        System.out.println("Снята сумма: " + sum);
    }
}
