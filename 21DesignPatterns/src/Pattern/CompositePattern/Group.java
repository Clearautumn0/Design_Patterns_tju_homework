package Pattern.CompositePattern;

import java.util.ArrayList;

public class Group extends Component {
    private String name;
    private ArrayList<Component> components; // <1

    public Group(String name) {
        this.name = name;
        this.components = new ArrayList<Component>();
    }

    public void add(Component component) {
        components.add(component);
        System.out.println(name + " add " + component.getName());
    }

    public void remove(Component component) {
        components.remove(component);
    }

    public ArrayList<Component> getComponents() {
        return components;
    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
        for (Component component : components) {
            component.display(depth + 2);
        }

    }

    @Override
    public void share(Component comp) {
        if (comp instanceof Group) {
            ArrayList<Component> comps = ((Group) comp).getComponents();
            for (Component component : comps) {
                component.share(component);
            }
        } else if (comp instanceof Member) {
            ((Member) comp).recive();
        }

    }

    @Override
    public String getName() {
        return name;
    }
}
