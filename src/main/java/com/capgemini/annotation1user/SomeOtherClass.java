package com.capgemini.annotation1user;

import com.capgemini.annotationprocessor.Handler;

@Handler( url = "http://someserver:8888/service/order/10",
          user = "gebruiker",
          password = "Secr&t01")
public class SomeOtherClass {

    public static void main(String[] args) {

    }
}
