package com.course.class1;

import com.course.class1.Model.Credit;
import com.course.class1.service.FrenchAmortization;

public class Main {
    public static void main (String [ ] args) {

        Credit credit = new Credit(1000L, 12, new FrenchAmortization(30L));
        System.out.println(credit.toString());
    }
}
