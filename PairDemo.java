class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void display() {
        System.out.println("Key: " + key + ", Value: " + value);
    }
}

public class PairDemo {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(1, "Angel");
        pair.display();
    }
}
