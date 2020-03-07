package org.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class MonitorDirectory {


	public static void main(String[] args) throws IOException,
	InterruptedException {
		Path path = Paths.get("C:/source");
		for (File f : path.toFile().listFiles()) { System.out.println("file Name " + f.getName());
		moveFile("C:/source/"+ f.getName(),"C:/destination/"+f.getName());   
		}
		/*
		 * Path path = Paths.get("C:/source"); WatchService watchService =
		 * FileSystems.getDefault().newWatchService(); path.register(watchService,
		 * StandardWatchEventKinds.ENTRY_CREATE);
		 * 
		 * boolean valid = true; do { WatchKey watchKey = watchService.take();
		 * 
		 * for (WatchEvent event : watchKey.pollEvents()) {
		 * 
		 * @SuppressWarnings("unused") WatchEvent.Kind kind = event.kind(); if
		 * (StandardWatchEventKinds.ENTRY_CREATE.equals(event.kind())) {
		 * 
		 * //String fileName = event.context().toString();
		 * 
		 * for (File f : path.toFile().listFiles()) { System.out.println("file Name " +
		 * f.getName()); moveFile("C:/source/"+
		 * f.getName(),"C:/destination/"+f.getName()); } } } valid = watchKey.reset();
		 * 
		 * } while (valid);
		 */

	}

	private static void moveFile(String src, String dest ) {
		Path result = null;
		try {
			result =  Files.copy(Paths.get(src), Paths.get(dest),StandardCopyOption.REPLACE_EXISTING);
			if(result != null) {
				System.out.println("File moved successfully.");
				File file = new File(src);
				if(file.isFile())
					file.delete();
			}else{
				System.out.println("File movement failed.");
			}  
		} catch(FileAlreadyExistsException ex) {
			File file = new File(src);
			if(file.isFile())
				file.delete();
		} catch (IOException e) {
			System.out.println("Exception while moving file: " + e);
		} catch(Exception e) {
			
		}
	}
}