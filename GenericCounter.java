public class GenericCounter {
    public static <T> int countOccurrences(T[] array, T element) {
        int count = 0;
        for (T item : array) {
            if (item.equals(element)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] names = {"Angel", "Jose", "Angel", "Maria"};
        int count = countOccurrences(names, "Angel");
        System.out.println("Occurrences of 'Angel': " + count);
    }
}
