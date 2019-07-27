package com.company.lec19;

import java.util.ArrayList;
import java.util.LinkedList;

public class MapAL<K,V> {

    private ArrayList<LinkedList<Entity>> list;

    public MapAL() {
       list=new ArrayList<>();
        for (int i = 0; i <100; i++) {
            list.add(new LinkedList<>());
        }
    }
    public void put(K key,V value){

        int hash= Math.abs(key.hashCode()%list.size());

        LinkedList<Entity> entities=list.get(hash);

        for (Entity entity:entities) {
            if(entity.key.equals(key)){
                entity.value=value;
                return;
            }
        }
        entities.add(new Entity(key,value));
    }

    public V get(K key){
        int hash= Math.abs(key.hashCode()%list.size());

        LinkedList<Entity> entities=list.get(hash);

        for (Entity entity:entities) {
            if(entity.key.equals(key)){
                return entity.value;
            }
        }
        return null;
    }
    public boolean containsKey(K key){
        return get(key)!=null;
    }

    public void remove(K key){
        int hash= Math.abs(key.hashCode()%list.size());

        LinkedList<Entity> entities=list.get(hash);

        Entity target=null;
        for (Entity entity : entities) {
            if (entity.key.equals(key)) {
                target=entity;
            }
        }
        entities.remove(target);
    }



    private class Entity{
        private K key;
        private V value;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
