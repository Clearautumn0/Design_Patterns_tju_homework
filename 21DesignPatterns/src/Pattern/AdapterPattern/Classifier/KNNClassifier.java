package Pattern.AdapterPattern.Classifier;

public class KNNClassifier implements ClassifierAdapter {

    @Override
    public void classify() {
        System.out.println("KNN Classifier is running...");
    }

}
