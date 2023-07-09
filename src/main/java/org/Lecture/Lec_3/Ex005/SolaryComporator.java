package org.Lecture.Lec_3.Ex005;

import java.util.Comparator;

public class SolaryComporator implements Comparator<Worker> {

  @Override
  public int compare(Worker o1, Worker o2) {
    return Integer.compare(o1.salary, o2.salary);
  }
  
}
