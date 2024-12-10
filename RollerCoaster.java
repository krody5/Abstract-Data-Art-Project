/**
 * Represents a Rollercoaster and information about it 
 */
public class RollerCoaster{
  private int speed; //the top speed of a rollercoaster
  private int length; // length of the rollercoaster
  private String region; //the region of where the rollercoaster is located
  private String country; //the country of where the rollercoaster is located
  private String city; //the city of where the rollercoaster is located
  private int year; //the year the rollercoaster was opened

    /** Constructor */
  public RollerCoaster(int speed, int length, String region, String country, String city, int year){
    this.speed = speed;
    this.length = length;
    this.region = region;
    this.country = country;
    this.city = city;
    this.year = year;
  }
    /** Accessor Method for speed */
  public int getSpeed(){
    return speed;
  }
    /** Accessor Method for length */
  public int getLength(){
    return length;
  }
    /** Accessor Method for region */
  public String getRegion(){
    return region;
  }
      /** Accessor Method for country */
  public String getCountry(){
    return country;
  }
     /** Accessor Method for city */
  public String getCity(){
    return city;
  }
     /** Accessor Method for year */
  public int getYear(){
    return year;
  }
    /** toString Method override */
  public String toString(){
    return "Country: " + country + "(" + region + ")" + "\n"+
      "Speed: " + speed + " mph"+ "\n"+
      "Length: " + length + "\n"+
      "City: " + city + "\n"+
      "Year: " + year;
  }
  //to string displaying country
  public String toStringCountry(){
    return "Country: "+ country + "(" + region + ")"; 
  }
  //to string displaying speed
  public String toStringSpeed(){
    return "Speed: " + speed + " mph";
  }
  //to string displaying length
  public String toStringLength(){
    return "Length: " + length;
  }
  //to string displaying city 
  public String toStringCity(){
    return "City: " + city;
  }
  //to string displaying the year
  public String toStringYear(){
    return "Year: " + year;
  }
  
}
