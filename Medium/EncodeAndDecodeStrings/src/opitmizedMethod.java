import java.util.ArrayList;
import java.util.List;

public class opitmizedMethod{
    public static String encode(List<String> strs){
        StringBuilder builder = new StringBuilder();
        for (String str : strs){
            builder.append(str.length()).append("#").append(str);
        }
        // input : [Hello, World]
        // output: 5#Hello5#World
        return builder.toString();
    }

    public static List<String> decode(String s){
        List<String> arrayList = new ArrayList<>();
        int i = 0;
        int n = s.length();
        while (i < n){
            int j = i;
            while (s.charAt(j) != '#'){ // 5#Hello5#World
                j++;
            }

            int length = Integer.parseInt(s.substring(i, j));
            arrayList.add(s.substring(j + 1, j + 1 + length));
            i = j + 1 + length;
        }
        return arrayList;
    }

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        System.out.println(encode(arrayList));
        System.out.println(decode(encode(arrayList)));
    }
}