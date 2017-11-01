import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;


public class MainApp {
    
    public static void main(String[] args) {
        System.out.println("Hello world");
        ByteBuf buffer = Unpooled.wrappedBuffer("TAGLENVAL".getBytes());
        
    }
}
