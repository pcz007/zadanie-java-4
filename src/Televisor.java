public class Televisor {

    boolean isOn=false;

    void turnOn() {
        isOn = true;
        System.out.println("Włączanie telewizora...");
    }
    void turnOff () {
        isOn = false;
        System.out.println("Wyłączanie telewizora...");
    }

    void showStatus() {
        //można zastosować if aby wyświetlany tekst był bardziej przyjazny dla odbiorcy
        System.out.println("Czy telewizor jest włączony? " + isOn);
    }
}