package Pattern.AdapterPattern;

public class DecTreeClassifier implements ClassifierAdapter {

    @Override
    public void classify() {
        System.out.println("Decision Tree Classifier is used for classification.");
    }

}
