package org.Lecture.Lec_2.Ex003.Ex006;


import org.Lecture.Lec_2.Ex003.Ex006.Applications.Notepad;
import org.Lecture.Lec_2.Ex003.Ex006.Format.Doc;
import org.Lecture.Lec_2.Ex003.Ex006.Format.Md;
import org.Lecture.Lec_2.Ex003.Ex006.Format.Txt;

public class Program {
    public static void main(String[] args) {
        
        Notepad notes = new Notepad();
        notes.newFile();
        notes.currentDocument().addAllText("text1");
        notes.currentDocument().addAllText("text2");
        notes.currentDocument().addAllText("text3");
        notes.SaveAs("file1", new Txt());
        notes.SaveAs("file2", new Md());
        notes.SaveAs("file3", new Doc());



    }
}
