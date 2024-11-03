import java.util.ArrayList;
import java.util.List;

public class MyHashSet {
    List<Integer> list = new ArrayList<>();
    public MyHashSet() {
        
    }

    public void add(int key) {
        list.add(key);
    }

    public void remove(int key) {
        list.remove(key);
    }

    public boolean contains(int key) {
        for (int num : list){
            if (num == key) return true;
        }
        return false;
    }

    /**
     * Your MyHashSet object will be instantiated and called as such:
     * MyHashSet obj = new MyHashSet();
     * obj.add(key);
     * obj.remove(key);
     * boolean param_3 = obj.contains(key);
     */
}
