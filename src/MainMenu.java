public class MainMenu extends Menu {
    public MainMenu() {
        super("Menú principal");

        // Primer submenú
        Menu archivos = new Menu("Archivos");
        archivos.add(new MenuItem("Crear archivo"));
        archivos.add(new MenuItem("Abrir archivo"));
        archivos.add(new MenuItem("Guardar archivo"));

        // Segundo submenú
        Menu edicion = new Menu("Edición");
        edicion.add(new MenuItem("Copiar"));
        edicion.add(new MenuItem("Pegar"));
        edicion.add(new MenuItem("Cortar"));

        // Añadimos los submenús al menú principal
        add(archivos);
        add(edicion);
    }
}