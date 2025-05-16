import java.util.List;

public class WildcardPrinter {
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<String> stringList = List.of("Angel", "Jose");
        List<Integer> intList = List.of(100, 200, 300);

        System.out.println("String List:");
        printList(stringList);

        System.out.println("Integer List:");
        printList(intList);
    }
}

