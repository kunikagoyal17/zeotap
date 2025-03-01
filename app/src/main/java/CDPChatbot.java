
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CDPChatbot {
    private static final Map<String, String> CDP_DOCS = Map.of(
        "segment", "https://segment.com/docs/",
        "mparticle", "https://docs.mparticle.com/",
        "lytics", "https://docs.lytics.com/",
        "zeotap", "https://docs.zeotap.com/home/en-us/"
    );

    private static final Map<String, String> docTexts = new HashMap<>();

    public static void main(String[] args) {
        indexDocs();
        System.out.println(askQuestion("How do I set up a new source in Segment?"));
    }

    private static void indexDocs() {
        for (Map.Entry<String, String> entry : CDP_DOCS.entrySet()) {
            String text = scrapeDocs(entry.getValue());
            docTexts.put(entry.getKey(), text);
        }
    }

    private static String scrapeDocs(String url) {
        try {
            Document doc = Jsoup.connect(url).get();
            Elements paragraphs = doc.select("p");
            StringBuilder text = new StringBuilder();
            for (Element p : paragraphs) {
                text.append(p.text()).append(" ");
            }
            return text.toString();
        } catch (IOException e) {
            return "";
        }
    }

    public static String askQuestion(String query) {
        // Simple keyword search
        for (Map.Entry<String, String> entry : docTexts.entrySet()) {
            if (entry.getValue().toLowerCase().contains(query.toLowerCase())) {
                return "Relevant content from " + entry.getKey() + " documentation: " + entry.getValue().substring(0, Math.min(500, entry.getValue().length())) + "...";
            }
        }
        return "No relevant documentation found.";
    }
}
