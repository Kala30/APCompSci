import java.util.Scanner;
import java.io.*;

public class IndexMaker
{

    private DocumentIndex index;
  
    public IndexMaker() throws IOException
    {
      String fileName = "fish.txt";

      BufferedReader inputFile =
                   new BufferedReader(new FileReader(fileName), 1024);
                 
      // Create index:

      index = new DocumentIndex();

      String line;
      int lineNum = 0;
      while ((line = inputFile.readLine()) != null)
      {
        lineNum++;
        index.addAllWords(line, lineNum);
      }

      inputFile.close();
    }
    
    public void showIndex() {
      for (IndexEntry entry : index)
        System.out.println(entry);
    }
    
    public String getIndexLine(int x) {
        return index.get(x).toString();
    }
}
