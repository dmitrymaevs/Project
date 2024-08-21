public class MainClass {
    public int getLocalNumber() {
        return 14;
    }

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        System.out.println("Возвращает число: " + mainClass.getLocalNumber());
    }
}