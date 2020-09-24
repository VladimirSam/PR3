package ru.mirea.ikbo2019.Samsonov.pr3.Movable;

public class TestMovable {
    public static void main(String[] args){
        MovablePoint a = new MovablePoint(2,5,3,7);
        MovableCircle b = new MovableCircle(4,5,2,6,4);
        MovableRectangle c = new MovableRectangle(6,7,8,1,9,10);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
