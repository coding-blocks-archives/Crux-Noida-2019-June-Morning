package com.company.lec19;

import java.util.ArrayList;
import java.util.LinkedList;

public class MapAL<K,V> {

    private ArrayList<LinkedList<Entity>> list;
    private int size=0;
    private float lf=0.5f;

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
        if(((float)(size))/list.size()>lf){
            rehash();
        }

        entities.add(new Entity(key,value));
        size++;
    }

    private void rehash() {
        ArrayList<LinkedList<Entity>> old =list;
        list= new ArrayList<>();

        for (int i = 0; i <old.size()*2 ; i++) {
            list.add(new LinkedList<>());
        }
        size=0;

        for (LinkedList<Entity> entries:old) {
            for (Entity entity:entries) {
                put(entity.key,entity.value);
            }
        }
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
        size--;
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
