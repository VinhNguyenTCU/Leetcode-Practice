import java.util.ArrayList;
    import java.util.List;

public class myMethod {
    public static String encode(List<String> strs){
        StringBuilder builder = new StringBuilder();
        for (String str : strs){
            builder.append(str);
            builder.append("%");
        }
        return builder.toString();
    }

    public static List<String> decode(String s){
        String[] decodeStrings = s.split("%", -1);
        
        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i < decodeStrings.length - 1; i++){
            arrayList.add(decodeStrings[i]);
        }
        // Arrays.asList(decodeStrings);
        // arrayList.subList(0, decodeStrings.length - 1);

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
