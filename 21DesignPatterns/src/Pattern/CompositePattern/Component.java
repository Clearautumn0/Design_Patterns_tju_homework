package Pattern.CompositePattern;

public abstract class Component {
    public  void add(Component component)throws Exception{

        throw new Exception("there is  no add method here");
    }

    public  void remove(Component component)throws Exception{
        throw new Exception("there is  no remove method here");
    }

    public abstract void share(Component comp);

    public  void display(int depth){
        throw new RuntimeException("there is  no display method here");
    }

    public abstract String getName() ;
}
