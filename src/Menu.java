import java.util.List;
import java.util.ArrayList;

public class Menu implements MenuComponent {
    private String name;
    private List<MenuComponent> components = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public void add(MenuComponent component) {
        components.add(component);
    }

    @Override
    public void display() {
        System.out.println(name + ":");
        for (MenuComponent component : components) {
            component.display();
        }
    }
}