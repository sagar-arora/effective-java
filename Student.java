public class Student {
  
  private final long rollNumber;
  private final String firstName;
  private final String lastName;
  
  public Student(long rollNumber, String firstName, String lastName) {
    this.rollNumber = rollNumber;
    this.firstName = firstName;
    this.lastName = lastName;
  }
  
  @Override
  public boolean equals(Object obj) {
    if(this == obj) {
      return true;
    }
    if(!obj instanceOf Student){
    retunr false;
    }
    Student student = (Student) obj;
    return this.rollNumber == rollNumber && this.firstName == firstName && this.lastName == lastName;
  }
  
  @Override
  public int hashCode() {
    int hash = Integer.hashCode(rollNumber);
    hash = 31 * hash + String.hashCode(firstName);
    hash = 31 * hash + String.hashCode(lastName);
    return hash;
  }
  
}
