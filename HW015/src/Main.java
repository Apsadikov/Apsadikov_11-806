import java.io.File;

public class Main {
    public static void main(String[] args) {
        String str1 = "я ел макороны и сосиску c хлебом на завтрак";
        String str2 = "я ел на завтрак котлету";

        ITextAnalyze textAnalyze = new CosineSimilarity();

        double similarity = textAnalyze.analyze(new SimpleTextProvivder(str1), new SimpleTextProvivder(str2));

//        File f1 = new File("src\\f1.txt");
//        File f2 = new File("src\\f2.txt");
//        double similarity = textAnalyze.analyze(new FileTextProvider(f1), new FileTextProvider(f2));

        System.out.println("similarity: " + similarity);
    }
}
