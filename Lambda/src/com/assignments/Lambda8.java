package com.assignments;

import java.util.function.Consumer;



class Lambda8{
    public void run() {
        System.out.println("thread is running");
    }



   }
class Sample implements Consumer<Integer>{
    public void accept(Integer num) {
        System.out.println("number is  :" +num);
    }
}
