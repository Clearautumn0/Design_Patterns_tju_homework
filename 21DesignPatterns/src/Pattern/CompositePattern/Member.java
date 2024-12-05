package Pattern.CompositePattern;

import java.util.ArrayList;

public class Member extends Component {
    private String name;

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void recive() {
        System.out.println(name + " received a message");
    }

    @Override
    public void share(Component comp) {
        if (comp instanceof Group) {
            ArrayList<Component> components = ((Group) comp).getComponents();
            if (components.contains(this)) {
                components.remove(this);
            }
            for (Component c : components) {
                c.share(c);
            }
            try {
                comp.add(this);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (comp instanceof Member) {
            ((Member) comp).recive();
        }

    }

}
