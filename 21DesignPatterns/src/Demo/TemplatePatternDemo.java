package Demo;

import Pattern.TemplatePattern.AbstractClassifier;
import Pattern.TemplatePattern.BayesClassifier;
import Pattern.TemplatePattern.DecTreeClassifier;
import Pattern.TemplatePattern.KNNClassifier;

public class TemplatePatternDemo {

    public static void main(String[] args) {
        // 测试贝叶斯分类
        AbstractClassifier classifier1 = new BayesClassifier();
        classifier1.run();
        System.out.println("----------------");
        // 测试决策树分类
        AbstractClassifier classifier2 = new DecTreeClassifier();
        classifier2.run();
        // 测试KNN分类
        System.out.println("----------------");
        AbstractClassifier classifier3 = new KNNClassifier();
        classifier3.run();

    }

}
