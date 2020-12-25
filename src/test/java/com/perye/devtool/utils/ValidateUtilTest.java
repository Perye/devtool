package com.perye.devtool.utils;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author perye
 * @date 2020/12/25 17:55
 */
@SpringBootTest
class ValidateUtilTest {

    @Test
    void testValidateUtilTest() {
        assertTrue(ValidateUtil.isEmpty(""));
        assertFalse(ValidateUtil.isEmpty("1"));
        ArrayList<Integer> array = new ArrayList<>();
        assertTrue(ValidateUtil.isEmpty(array));
        array.add(1);
        assertFalse(ValidateUtil.isEmpty(array));
    }

}