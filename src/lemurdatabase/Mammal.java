/*
 * Ferris D.
 * 27/11/2018
 */

package lemurdatabase;

public class Mammal {
  private int itsAge;
  private int itsWeight;
  String breed, itsGender;

  public Mammal() {
    setGender(random(1,2));
    itsAge = random(2,14);
    itsWeight = random(1,(itsAge > 10) ? 7 : itsAge);
  }
  
  public void setGender(int gender) {
      itsGender = (gender == 1) ? "Male" : "Female";
  }

  public int getAge() {
    return itsAge;
  }

  public int getWeight() {
    return itsWeight;
  }

  public void setAge(int newAge) {
    itsAge = newAge;
  }

  public void setWeight(int newWeight) {
    itsWeight = newWeight;
  }

  public String getBreed() {
    return breed;
  }

  public void setBreed(String newBreed) {
    breed = newBreed;
  }

  public void speak() {
    //will be overwritten by Dog class and Cat class
  }
  
  public String toString(){
      String output = "";
      output += "Gender : "+itsGender+"\n";
      output += "Age : "+itsAge+"\n";
      output += "Weight : "+itsWeight+"\n";
      return output;
  }
  
  public static int random(int min, int max){
    int range = (max - min) + 1;     
    return (int)(Math.random() * range) + min;
  }
}