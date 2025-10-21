package lab3;

public class HashTable<K, V> {
    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;
        Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
    private Node<K,V>[] table;
    private int size;

    public HashTable() {
        this.table = new Node[10];
        this.size = 0;
    }

    private int hash(K key) {
        return Math.abs(key.hashCode() % 10);
    }

    public void put(K key, V value) {
        int index = hash(key);
        Node<K, V> node = table[index];
        while (node != null) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
            node = node.next;
        }


        table[index] = new Node<>(key, value, table[index]);

        size++;
    }

    public V get(K key) {
        int index = hash(key);
        Node<K, V> node = table[index];
        if (node == null) {return null;}

        while (node != null) {
            if (node.key.equals(key)) {
                return node.value;
            }
            node = node.next;
        }
        return null;
    }

    public void remove(K key) {
        int index = hash(key);
        Node<K, V> node = table[index];
        Node<K, V> prev = null;
        if (node == null) {return;}

        while (node != null) {
            if (node.key.equals(key)) {
                if (prev == null) {table[index] = node.next;}
                else {prev.next = node.next;}
                size--;
                return;
            }
            prev = node;
            node = node.next;
        }

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}
