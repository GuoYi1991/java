package javaday2;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class testNio {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("d://untitled.html");
		FileOutputStream fos = new FileOutputStream("d://untitled2.html");
		FileChannel channel = fis.getChannel();
		FileChannel channel2 = fos.getChannel();
		ByteBuffer allocate = ByteBuffer.allocate(1024);
		int len = -1;
		while ((len = channel.read(allocate)) != -1) {

			allocate.flip();
			channel2.write(allocate);
			allocate.clear();
		}
		channel2.close();
		channel.close();
		fis.close();
		fos.close();
	}
}
