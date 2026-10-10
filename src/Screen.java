public class Screen {
    public void displayButton(Button button) {
        System.out.println("Mostrando el botón en pantalla...");
        System.out.println("Haciendo clic en el botón...");
        button.onClick();
    }
}