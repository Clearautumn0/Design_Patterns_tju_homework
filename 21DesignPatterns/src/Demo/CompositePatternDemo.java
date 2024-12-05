package Demo;

import Pattern.CompositePattern.Component;
import Pattern.CompositePattern.Group;
import Pattern.CompositePattern.Member;

public class CompositePatternDemo {
    public static void main(String[] args) throws Exception {
        Component mem1 = new Member("Memory 1");
        Component mem2 = new Member("Memory 2");
        // Component mem3=new Member("Memory 3");

        Component group1 = new Group("Group 1");
        group1.add(mem1);
        group1.add(mem2);

        Component group2 = new Group("Group 2");
        group1.add(group2);

        mem1.share(group1);
        group1.share(group2);

    }
}
