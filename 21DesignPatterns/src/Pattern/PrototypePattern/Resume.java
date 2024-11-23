package Pattern.PrototypePattern;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Resume implements Cloneable, Serializable {
    private String name;
    private String jobTitle;
    private Photo photo;

    public Resume(String name, String jobType, Photo photo) {
        this.name = name;
        this.jobTitle = jobType;
        this.photo = photo;
    }

    // 浅克隆
    @Override
    public Resume clone() throws CloneNotSupportedException {
        return (Resume) super.clone();

    }

    public Resume deepClone() throws CloneNotSupportedException {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(bos)) {

            oos.writeObject(this);
            oos.close();

            try (ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
                    ObjectInputStream ois = new ObjectInputStream(bis)) {

                return (Resume) ois.readObject();
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobType) {
        this.jobTitle = jobType;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", photo=" + photo +
                '}';
    }

}
