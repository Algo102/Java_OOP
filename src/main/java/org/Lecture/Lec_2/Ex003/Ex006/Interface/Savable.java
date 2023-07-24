package org.Lecture.Lec_2.Ex003.Ex006.Interface;


import org.Lecture.Lec_2.Ex003.Ex006.Document.TextDocument;

public interface Savable {
    void SaveAs(TextDocument document, String path);
}
