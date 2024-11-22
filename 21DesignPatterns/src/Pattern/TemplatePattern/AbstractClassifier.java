package Pattern.TemplatePattern;


/*
 * 模拟实现抽象分类器
 * 
 * 定义一个抽象类AbstractClassifier，它有三个方法：inputData()、transformData()、classify()。
 * 
 * 子类可以继承AbstractClassifier，并实现inputData()、transformData()、classify()方法。
 * 
 * 子类必须实现classify()方法，它负责对输入数据进行分类，并显示结果。
 * 
 * 调用run()方法，它会调用inputData()、transformData()、classify()、displayResult()方法，完成整个分类过程。
 * 
 * 这样，子类只需要实现分类算法，就可以完成分类任务。
 * 
 * 这样的设计模式被称为模板模式（Template Pattern）。
 * 
 * @author 覃邱维

 */



public abstract class AbstractClassifier {
    protected void inputData() {
        System.out.println("第一步：输入数据....");
    }

    protected void transformData() {
        System.out.println("第二布：转换数据....");
    }

    public abstract void classify();

    protected void displayResult() {
        System.out.println("第三步：显示结果....");
        }
    public final void run() {
        inputData();
        transformData();
        classify();
        displayResult();
    }
}
