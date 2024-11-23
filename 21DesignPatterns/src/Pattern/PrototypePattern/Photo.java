package Pattern.PrototypePattern;

import java.io.Serializable;

public class Photo implements Serializable {
    private String figure;

    public Photo(String figure) {
        this.figure = figure;
    }

    public void setFigure(String figure) {
        this.figure = figure;
    }

    public String getFigure() {
        return figure;
    }

    public void show() {
        System.out.println("This is a " + figure + " photo.");
    }

    @Override
    public String toString() {
        return "Photo{" + "figure='" + figure + '\'' + '}';
    }
}
