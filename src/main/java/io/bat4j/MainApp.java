package io.bat4j;


import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;


public class MainApp {
    
    static int min(int a, int b) {
        return a < b ? a : b;
    }
    
    public static void main(String[] args) {
        System.out.println("Hello world");
        int n = Integer.parseInt(args[0]);
        BigInteger cardS = new BigInteger();
        
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - 1; j++) {
                for(int x = 1; x < min(n - i, n - j); x++) {
                    cardS += 1 + min(i, n - j -x -1);
                }
            }
        }        
        
        System.out.println("nb solution : " + cardS);
    }
}
