package main.java.com.quantcast.mostactivecookie;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    	try {
    
    		if(args.length==0) {
    			
    			System.out.println("Command line arguments are missing. Kindly check if -f <filename> -d <date> is passed correctly");
    			System.out.println(">> Sample to run using command line -  java -jar quantcast_coding_task-1.0-SNAPSHOT.jar -f cookie_log.csv -d 2018-12-08 ");
    			
    		}else if(("-f").equals(args[0]) && ("-d").equals(args[2])
    				&& (!args[1].isEmpty()) && (!args[3].isEmpty())){
    			
    			String filename = args[1];
    			String date = args[3];
    		
    			LogFileUtility lfr = new LogFileUtility();
    			lfr.readLogAndCreateMap(filename);
    			ArrayList<String> res = lfr.findMostActiveCookie(date, lfr.getCookieLogs());
    			
    				for(String s: res){
    						System.out.println(s);
    				}
            }else {
            	System.out.println(">> Kindly pass -f argument followed by filename and -d argument followed by Date from the command line");
            }
    		
    	} catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBound - Command line arguments are missing. Kindly pass -f <filename> -d <date> arguments");
         }
        
    }
}
