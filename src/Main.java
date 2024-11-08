public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(15000);

        while (true) {
            try {
                account.withDraw(6000);
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                try {
                    account.withDraw((int) e.getRemainingAmount());
                } catch (LimitException ex) {
                    System.out.println("Неожиданная ошибка: " + ex.getMessage());
                }
                break;
            }
        }
        System.out.println("Текущий остаток на счете: " + account.getAmount());
    }
}
