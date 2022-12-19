package LopPair;

public class Pair {
    private int x,y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isPrime() {
        if(nguyenTo(x)&&nguyenTo(y)) return true;
        return false;
    }

    private boolean nguyenTo(int x) {
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
        return String.format("%d %d",x,y);
    }
}
