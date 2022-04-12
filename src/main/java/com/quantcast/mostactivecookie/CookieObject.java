package main.java.com.quantcast.mostactivecookie;

import java.util.Objects;

/** 
Cookie POJO class
 */
public class CookieObject {
    private String cookieID;
    private String date;
    private int frequency;

    public CookieObject(String cookieID, String date, int frequency){
        this.cookieID = cookieID;
        this.date = date;
        this.frequency = frequency;
    }
    public String getCookieID(){
        return cookieID;
    }
    public String getDate(){
        return date;
    }
    public int getFrequency(){
        return frequency;
    }
    public void incrementFreq(){
        frequency = frequency+1;
    }
    
	@Override
	public int hashCode() {
		return Objects.hash(cookieID, date, frequency);
	}
	
	 @Override
	    public boolean equals(Object obj){
	        CookieObject cookie = (CookieObject) obj;
	        if(cookieID.equals(cookie.getCookieID()) && date.equals(cookie.getDate())){
	            return true;
	        }
	        return false;
	    }
	    
    
}
