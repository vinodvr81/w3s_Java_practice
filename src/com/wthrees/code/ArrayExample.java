package com.wthrees.code;
public class ArrayExample {
    private int[] age = {43, 65, 34, 73, 89};

    public void correct(int[] age) {
        this.age = age;
        for (int i = 0; i < this.age.length; i++) {
            if (this.age[i] > 40) {
                System.out.println(this.age[i] + ": You are in middle age");
            } else {
                System.out.println(this.age[i] + ": You are young");
            }
        }
    }

    public static void main(String[] args) {
        ArrayExample f = new ArrayExample();
        f.correct(new int[]{43, 65, 34, 73, 89});
    }
}
