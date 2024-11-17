public class Praktikum {
    public static void main(String[] args) {
        String nameToTest = "Тимоти Шаламе"; // тестируемое имя
        Account account = new Account(nameToTest);

        if (account.checkNameToEmboss()) {
            System.out.println("Имя подходит для печати на карте.");
        } else {
            System.out.println("Имя не подходит для печати на карте.");
        }
    }
}