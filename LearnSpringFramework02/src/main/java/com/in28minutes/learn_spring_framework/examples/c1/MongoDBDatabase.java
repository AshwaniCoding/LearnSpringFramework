package com.in28minutes.learn_spring_framework.examples.c1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
@Qualifier
public class MongoDBDatabase implements DataService{
    @Override
    public int[] data() {
        return new int[]{1,2,3,4,5};
    }
}
