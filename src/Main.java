public class Main {
    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu();
        mainMenu.display();
    }
}

/* Preguntas que debes ser capaz de responder
1) ¿Qué papel desempeña la interfaz MenuComponent?
Define la interfaz común con el método display(), que deben implementar tanto los elementos 
individuales como los menús.

2) ¿Por qué pueden MenuItem y Menu implementar la misma interfaz MenuComponent?
Porque ambos representan componentes del menú y necesitan proporcionar el método display(). 
Así pueden tratarse de manera uniforme.

3) ¿Cómo puede un Menu contener otros objetos Menu además de objetos MenuItem?
Mediante una lista de tipo List<MenuComponent>. Como MenuItem y Menu implementan esa interfaz, 
ambos pueden almacenarse en la lista.

4) Si mañana añadimos otro tipo de componente de menú, ¿qué nueva clase crearías y qué código
existente no tendrías que modificar? 
Crearía una nueva clase que implemente MenuComponent y defina display(). No sería necesario 
modificar Menu ni su método display(), siempre que el nuevo componente pueda incorporarse mediante add(). */