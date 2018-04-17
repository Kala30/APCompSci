
/**
 * Write a description of class Testing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Testing
{
    public static void main(String[] args) {
        DocumentIndex docIndex = new DocumentIndex();
        
        docIndex.addAllWords("A B C D D E F D C A B C F E B A", 0);
        docIndex.addAllWords("A B C D D E F D C A B C F E B A", 1);
        docIndex.addAllWords("C B A", 2);
        System.out.println(docIndex);
    }
}
