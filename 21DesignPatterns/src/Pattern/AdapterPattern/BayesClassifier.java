package Pattern.AdapterPattern;

public class BayesClassifier implements ClassifierAdapter {

    @Override
    public void classify() {
        System.out.println("Bayes Classifier is used to classify the data.");
    }

}
