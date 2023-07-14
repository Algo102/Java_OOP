package org.Lecture.Lec_5.Ex1_Calc;

public class Presentor {

    // Заваодим презентор, который будет работать с вью и моделью
    View view;
    Model model;

    public Presentor(Model m, View v){
        model = m;
        view = v;
    }

    public void buttonClick(){
        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);

        int result = model.result();
        view.print(result, "Sum: ");
    }

}
