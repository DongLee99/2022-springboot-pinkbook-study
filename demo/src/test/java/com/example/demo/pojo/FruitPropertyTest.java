package com.example.demo.pojo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class FruitPropertyTest {

    @Autowired
    FruitProperty fruitProperty;

    @Test
    public void Test() {
        List<Map> fruitData = fruitProperty.getList();
    }


}