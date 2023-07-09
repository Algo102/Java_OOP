package org.Seminar.Sem_3.core.personal;


import org.Seminar.Sem_3.core.personal.actionPers.Injection;

public class Nurse extends Worker implements Injection {
    public Nurse(){    
  }

  public Nurse(int idMed, String firstName, String lastName) {
    super(idMed, firstName, lastName);   
  }

  public void dressing() {
    System.out.println(CLASS_NAME + " Перевязала");
  }

  @Override
  public int injection() {
    System.out.println(CLASS_NAME + "делает укол: 1 раза");
        return 1;
  }
}
