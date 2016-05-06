import com.sun.source.tree.BinaryTree;

/**
 * Created by smurthi on 5/5/16.
 * It is a type of encoding where the binary tree is created from a frequency table
 */
public class HoffmanCoding {

    Map<char,Byte[]> createHoffmanCodesForGivenString (String str)
    {
        Map<char,int> frequecyTable = createfrequencyTable(str);
        BinaryTree<Node> createbinaryTreeFromFrequencyTable (frequecyTable);

        for()
    }

}
