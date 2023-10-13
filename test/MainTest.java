import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    @DisplayName("test so nguyen to")
    public void test1(){
        int input = 3;
        boolean excepted = true;
        boolean result =Main.isPrice(input);
        assertEquals(excepted,result);
    }
    @Test
    @DisplayName("test so nguyen to")
    public void test2(){
        int input = 5;
        boolean excepted = true;
        boolean result =Main.isPrice(input);
        assertEquals(excepted,result);
    }
    @Test
    @DisplayName("test so nguyen to")
    public void test3(){
        int input = 8;
        boolean excepted = false;
        boolean result =Main.isPrice(input);
        assertEquals(excepted,result);
    }
    @Test
    @DisplayName("test so nguyen to")
    public void test4(){
        int input = -1;
        boolean excepted = false;
        boolean result =Main.isPrice(input);
        assertEquals(excepted,result);
    }
    @Test
    @DisplayName("test so nguyen to")
    public void test5(){
        int input = 9;
        boolean excepted = false;
        boolean result =Main.isPrice(input);
        assertEquals(excepted,result);
    }
    @Test
    @DisplayName("test so nguyen to")
    public void test6(){
        int input = 101;
        boolean excepted = true;
        boolean result =Main.isPrice(input);
        assertEquals(excepted,result);
    }
    @Test
    @DisplayName("test so nguyen to")
    public void test7(){
        int input = 91;
        boolean excepted = false;
        boolean result =Main.isPrice(input);
        assertEquals(excepted,result);
    }

}