package Assignments;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataThread implements Runnable{
	
	
	private String sourceFile;
	private String targetFile;
	public CopyDataThread(String sourceFile, String targetFile) {
		super();
		this.sourceFile = sourceFile;
		this.targetFile = targetFile;
		new Thread(this).start();
	}
	@Override
	public void run() {
		try(FileInputStream fis = new FileInputStream(sourceFile);
                    FileOutputStream fos = new FileOutputStream(targetFile)) {
			byte[] barr = new byte[10];
			
			while(fis.read(barr) != -1) {
				Thread.sleep(500);
				fos.write(barr);
				System.out.println("10 characters are copied");
			}
		}catch(IOException iex) {

		} catch (InterruptedException e) {
			
		}
	}
}


