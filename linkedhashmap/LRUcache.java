package linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUcache<K,V> extends LinkedHashMap<K,V> {
  private int capacity;
  public LRUcache(int capacity){
      super(capacity,0.75f,true);
         this.capacity= capacity;
  }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
      return size() > capacity;
    }

    public static void main(String[] args) {
   LRUcache<String,Integer>studentMap = new LRUcache<>(3);
   studentMap.put("aditi",98);
   studentMap.put("janvi",99);
   studentMap.put("astha",100);
   studentMap.put("vibhu",6);
        System.out.println(studentMap);
    }
}
