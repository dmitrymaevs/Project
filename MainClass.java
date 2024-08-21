public class MainClass {
    private int class_number = 20;
    private String class_string = "Hello, world";

    public int getClassNumber() {
        return class_number;
    }

    public String getClassString() {
        return class_string;
    }

    public int getLocalNumber() {
        return 14;
    }

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        System.out.println("Возвращает число: " + mainClass.getLocalNumber());
        System.out.println("Число равно: " + mainClass.getClassNumber());
        System.out.println("Строка возвращает: " + mainClass.getClassString());
    }
}