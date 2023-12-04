package leetcode;

import java.util.ArrayList;
import java.util.List;

public class OrderedStream {
    String[] stream;
    int currHead = 0;

    public OrderedStream(int n) {
        stream = new String[n];
    }

    public static void main(String[] args) {
        OrderedStream os = new OrderedStream(5);
        List<String> param_1 = os.insert(3, "ccccc"); // Inserts (3, "ccccc"), returns [].
        List<String> param_2 = os.insert(1, "aaaaa"); // Inserts (1, "aaaaa"), returns ["aaaaa"].
        List<String> param_3 = os.insert(2, "bbbbb"); // Inserts (2, "bbbbb"), returns ["bbbbb", "ccccc"].
        List<String> param_4 = os.insert(5, "eeeee"); // Inserts (5, "eeeee"), returns [].
        List<String> param_5 = os.insert(4, "ddddd"); // Inserts (4, "ddddd"), returns ["ddddd", "eeeee"].

        System.out.println(param_1);
        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);
        System.out.println(param_5);
    }

    public List<String> insert(int idKey, String value) {

        stream[idKey - 1] = value;
        ArrayList<String> streamOrdered = new ArrayList<>();

        if (currHead == idKey - 1) {
            while (currHead < stream.length && null != stream[currHead]) {
                streamOrdered.add(stream[currHead]);
                currHead++;
            }
        }

        return streamOrdered;
    }
}
