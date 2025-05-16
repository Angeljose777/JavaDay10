import java.util.List;

public class BoundedSum {
    public static <T extends Number> double sum(List<T> list) {
        double total = 0.0;
        for (T num : list) {
            total += num.doubleValue();
        }
        return total;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40);
        System.out.println("Total Sum: " + sum(numbers));
    }
}
