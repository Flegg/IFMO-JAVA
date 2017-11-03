package com.ifmo.objects.list;

//public class ArrayList implements IList {
//
//    private Object[] objects;
//    private static final int DEFAULT_SIZE = 10;
//    private int size;
//
//    public ArrayList() {
//        this.objects = new Object[DEFAULT_SIZE];
//    }
//
//    @Override
//    public void add(Object o) {
//        if (size + 1 <= DEFAULT_SIZE) {
//            objects[size++] = o;
//        }
//        else {
//            Object[] tmp = new Object[(int)(size * 1.5)];
//            System.arraycopy(objects, 0, tmp, 0, size);
//            objects = tmp;
//            objects[size++] = o;
//        }
//    }
//
//    @Override
//    public Object get(int index) {
//        return null;
//    }
//
//    @Override
//    public Object remove(int index) {
//        return null;
//    }
//}
