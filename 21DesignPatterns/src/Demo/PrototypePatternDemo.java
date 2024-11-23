package Demo;

import Pattern.PrototypePattern.Photo;
import Pattern.PrototypePattern.Resume;

public class PrototypePatternDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 创建模板
        Photo photo = new Photo("原图");
        Resume resume = new Resume("张三", "计算机", photo);

        System.out.println("模板简历：" + resume);

        // 浅克隆
        Resume resume1 = resume.clone();
        resume1.setName("浅克隆");
        resume1.setJobTitle("打灰");
        resume1.setPhoto(resume.getPhoto());

        System.out.println("浅克隆简历(共享照片)：" + resume1);

        // 修改模板中的照片
        photo.setFigure("图片1");
        System.out.println("模板简历：" + resume);
        System.out.println("浅克隆简历：" + resume1);

        // 深克隆
        Resume resume2 = resume.deepClone();
        resume2.setName("深克隆");
        resume2.setJobTitle("搬砖");

        System.out.println("深克隆简历(独立照片)：" + resume2);

        // 修改模板中的照片
        resume2.getPhoto().setFigure("图片2:深图片");

        System.out.println("修改图片后深克隆简历：" + resume2);
        System.out.println("深克隆之后的修改图片之后模板简历：" + resume);

    }
}
