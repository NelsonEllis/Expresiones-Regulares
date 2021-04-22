import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class java_regex {
  publicstaticvoid main(String[] args) {
    finalString file = "results.csv";
    final Pattern pat = Pattern.compile("^[\\d\\-]+,.*[zk].*$");
    
    try {
      BufferedReader br = newBufferedReader(new FileReader(file));
      String line;

      while((line = br.readLine()) != null) {
        Matcher matcher = pat.matcher(line);
        
        if(matcher.find()) {
          System.out.println(line);
        }
      }

      br.close();
    } catch(IOException err) {
      System.out.println(err);
    }
  }
}