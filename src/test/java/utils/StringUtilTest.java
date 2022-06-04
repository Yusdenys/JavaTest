package utils;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    public static void main(String[] args) {

    }

    @Test
    public void repeat_string_once() {
        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3));
    }

    @Test
    public void repeat_string_multimple_times() {
        Assert.assertEquals("hola", StringUtil.repeat("hola", 1));
    }

    @Test
    public void repeat_string_zero_times() {
        Assert.assertEquals("", StringUtil.repeat("hola", 0));
    }

    @Test (expected = IllegalArgumentException.class)
    public void repeat_string_negative_times() {
        Assert.assertEquals("", StringUtil.repeat("hola", -1));
    }
}