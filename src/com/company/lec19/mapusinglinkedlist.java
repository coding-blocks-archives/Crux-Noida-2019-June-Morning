package com.company.lec19;

import java.util.LinkedList;

public class mapusinglinkedlist {

    private LinkedList<Entity> entities=new LinkedList<>();

    public void put(String Key,String value){

        for (Entity entity:entities) {
            if(entity.key.equals(Key)){
                entity.value=value;
                return;
            }
        }
        entities.add(new Entity(Key,value));
    }

    public String get(String Key){

        for (Entity entity:entities) {
            if(entity.key.equals(Key)){
                return entity.value;
            }
        }
        return null;
    }

    public void remove(String Key) {
         Entity target=null;
        for (Entity entity : entities) {
            if (entity.key.equals(Key)) {
                target=entity;
            }
        }
        entities.remove(target);
    }

    @Override
    public String toString() {

        String s="";
        s+=("{");

        for (Entity entity:entities) {
            s+=(entity.key+" = "+entity.value+", ");
        }

        s+=("}");

        return s;
    }

    private class Entity{
        String key;
        String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
