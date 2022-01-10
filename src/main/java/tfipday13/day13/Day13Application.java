package tfipday13.day13;

import java.io.File;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class Day13Application {
public static File fileDir;
	public static void main(String[] args) {
		ApplicationArguments argumentFromConsole=new DefaultApplicationArguments(args);
		List argumentOption=argumentFromConsole.getOptionValues("dataDir");
		SpringApplication.run(Day13Application.class, args);
		if (argumentOption==null){
			System.out.println("argument is empty.");
			System.exit(1);
		}//end if
		 else {
			 String PathOfFile=(String)argumentOption.get(0);
			 File fileDirectory=new File(PathOfFile);
				if (!fileDirectory.exists()){
					fileDirectory.mkdirs();
				}//end if to check if directory exist
			fileDir=fileDirectory;
		}//end else
	}//end main

}
