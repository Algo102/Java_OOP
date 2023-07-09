package org.DZ.DZ_2.core.personal;


import org.DZ.DZ_2.core.personal.actionPers.Injection;

public class Doctor extends Worker implements Injection {
  public Doctor(){    
  }

  public Doctor(int idMed, String firstName, String lastName) {
    super(idMed, firstName, lastName);   
  }

  public void inspection() {
    System.out.println(CLASS_NAME + " Осмотрел");
  }

    @Override
  public int injection() {
    System.out.println(CLASS_NAME + "делает укол: 1 раза");
        return 1;
  }
    

}
