/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2.LopPair;

/**
 *
 * @author DELL
 */
public class Pair<T,V> {
    private T x;
    private V y;
    
    public Pair(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public boolean isPrime() {
        if(nguyenTo(x)&&nguyenToy(y)) return true;
        return false;
    }

    private boolean nguyenTo(T xx) {
        int x = (Integer) xx;
        if(x<2) return false;
        if(x<4) return true;
        if(x%2==0||x%3==0) return false;
        for(int i=5;i*i<=x;i+=6){
            if(x%i==0 ||x%(i+2)==0)
                return false;
        }
        return true;
    }
    private boolean nguyenToy(V xx) {
        int x = (Integer) xx;

        if(x<2) return false;
        if(x<4) return true;
        if(x%2==0||x%3==0) return false;
        for(int i=5;i*i<=x;i+=6){
            if(x%i==0 ||x%(i+2)==0)
                return false;
        }
        return true;
    }
    public String toString(){
        return x+" "+y;
    }
}
