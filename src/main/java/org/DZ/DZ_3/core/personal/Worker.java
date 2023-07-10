package org.DZ.DZ_3.core.personal;


public abstract class Worker {
  protected final String CLASS_NAME = "The " + getClass().getSimpleName();
  protected int idMed;     
  protected String firstName;
  protected String lastName;    
  
  public Worker() {
  }
  
  public Worker(int idMed, String firstName, String lastName) {
      this.idMed = idMed;
      this.firstName = firstName;
      this.lastName = lastName;        
  }

}
