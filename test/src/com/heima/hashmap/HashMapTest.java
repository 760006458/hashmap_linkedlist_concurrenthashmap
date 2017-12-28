package com.heima.hashmap;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

/**
 * xuan
 * 2017/12/28
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<User, Integer> map = new HashMap<>();
        for (int j = 0; j < 100; j++) {
            int i = new Random().nextInt(100);
            User user = getUser("张" + i, i);
            map.put(user, i);
        }
        map.put(null,1111);

        LinkedList<Object> list = new LinkedList<>();
        list.get(10);
    }

    public static User getUser(String name, Integer age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        return user;
    }

    @Test
    public void test1() {
        System.out.println(1 << 30);
    }
}
