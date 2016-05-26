package com.kaishengit;

import javax.inject.Named;

@Named
public class MyJob {

    public void sayHello() {
        System.out.println("Hello,Spring + QuartZ");
    }

}
