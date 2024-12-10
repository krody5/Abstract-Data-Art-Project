import org.code.theater.*;
import org.code.media.*;
/*
 * Represents a Scene to be played in the Theater using data from
 * a choses dataset
 */
public class DataScene extends Scene {
  private RollerCoaster[] rollerCoasters; // 1D Array of RollerCoaster Objects
  private String soundFile1;
  private String soundFile2;
    /** Constructor */
  //sound files displayed in video
    public DataScene(String soundFile1, String soundFile2) {
    this.soundFile1 = soundFile1;
    this.soundFile2 = soundFile2;
    rollerCoasters = createRollerCoasters();
  }
   /** Returns a 1D array of Rollercoaster objects using the txt files in this project */
 public RollerCoaster[] createRollerCoasters() {
    int[] speedArray = FileReader.toIntArray("speed.txt");
    int[] lengthArray = FileReader.toIntArray("length.txt");
    String[] regionArray = FileReader.toStringArray("region.txt");
    String[] countryArray = FileReader.toStringArray("country.txt");
    String[] cityArray = FileReader.toStringArray("city.txt");
    int[] yearArray = FileReader.toIntArray("year.txt");
   
   

   
   RollerCoaster[] rollerCoasterArray = new RollerCoaster[speedArray.length];
    for (int i = 0; i < rollerCoasterArray.length; i++) {
      rollerCoasterArray[i] = new RollerCoaster(speedArray[i], lengthArray[i], regionArray[i], countryArray[i], cityArray[i], yearArray[i]);
    }

    return rollerCoasterArray;
  }

  /**
   * Top-level method to draw the animation
   */
  public void drawScene() {
    //displays a random roller coaster and the info from the data sets
    int randomIndex = (int) (Math.random() * rollerCoasters.length);
    RollerCoaster r = rollerCoasters[randomIndex];
    //if else if statement using an or operator that displays a roller coaster image based on the random region 

    if (r.getRegion().equals("Latin America") || r.getRegion().equals("Europe")) {
    clear("white");
    drawImage("rollercoaster2.jpg", 50, 50, 300);
} else if (r.getRegion().equals("North America")) {
    clear("white");
    drawImage("rollercoaster3.jpg", 50, 50, 300);
}
    

    //plays roller coaster wav. files 
    playSound(soundFile1);
    playSound(soundFile2);
    pause(0.5);
    //displays text for all the data sets 
    drawText(r.toStringCountry(), 20, 150);
    drawText(r.toStringSpeed(), 20, 200);
    drawText(r.toStringLength(), 20, 250);
    drawText(r.toStringCity(), 20, 300);
    drawText(r.toStringYear(), 20, 350);
    System.out.println(r);
  }

  /** Other Methods */
  



  
}
