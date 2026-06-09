package com.example.generics.classes;

public class GenericClass<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

class GenericMulti<T, U> {
    private T t;
    private U u;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public U getU() {
        return u;
    }

    public void setU(U u) {
        this.u = u;
    }

    @Override
    public String toString() {
        return "t=" + t + ", u=" + u;

    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        GenericClass<String> gcs = new GenericClass<>();
        GenericClass<Integer> gci = new GenericClass<>();

        gcs.setData("John");
        gci.setData(100);

        System.out.println(gcs.getData());
        System.out.println(gci.getData());

        GenericMulti<Integer, String> gcm = new GenericMulti<>();
        gcm.setT(1);
        gcm.setU("One");
        gcm.setT(2);
        gcm.setU("Two");
        gcm.setT(3);
        gcm.setU("Three");

        GenericMulti<Integer, String>[] gcma = new GenericMulti[3];
        gcma[0] = new GenericMulti<Integer, String>();
        gcma[0].setT(10);
        gcma[0].setU("One");
        gcma[1] = new GenericMulti<Integer, String>();
        gcma[1].setT(11);
        gcma[1].setU("Two");
        gcma[2] = new GenericMulti<Integer, String>();
        gcma[2].setT(12);
        gcma[2].setU("Three");

        for (GenericMulti<Integer, String> s : gcma) {
            System.out.println(s);
        }
    }

}
