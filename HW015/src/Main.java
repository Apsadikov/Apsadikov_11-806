import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        String str1 = "я ел макороны и сосиску c хлебом на завтрак";
//        String str2 = "я ел на завтрак котлету";
//
//        ITextAnalyze textAnalyze = new CosineSimilarityImpl();
//
//        double similarity = textAnalyze.analyze(new SimpleTextProviderImpl(str1), new SimpleTextProviderImpl(str2));
//
//        File f1 = new File("src\\f1.txt");
//        File f2 = new File("src\\f2.txt");
//        double similarity = textAnalyze.analyze(new FileTextProvider(f1), new FileTextProvider(f2));
//
//        System.out.println("similarity: " + similarity);

        SearchEngineImpl searchEngine = new SearchEngineImpl();
        List<ITextProvider> textProviderList = new ArrayList<>();

        textProviderList.add(new SimpleTextProviderImpl("сегодня не было дождя"));
        textProviderList.add(new SimpleTextProviderImpl("сегодня был снег"));
        textProviderList.add(new SimpleTextProviderImpl("вчера не было снега"));
        textProviderList.add(new SimpleTextProviderImpl("был дождь"));

        ITextProvider query = new SimpleTextProviderImpl("был снег");

        List<ITextProvider> sortList = searchEngine.getSortedByRelevanceList(new CosineSimilarityImpl(), query, textProviderList);
        for (ITextProvider textProvider: sortList) {
            System.out.println(textProvider.getText());
        }
    }
}