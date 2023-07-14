package org.Lecture.Lec_5.Ex002Phonebook.Core.MVP;

// 5. ћожет потребоватьс€, механизм получени€ и указани€
// фамилии, имени, описани€
// “ехнически, иерархию можно строить и с интерфейсами
public interface View {
    String getFirstName();
    void setFirstName(String value);
    String getLastName();
    void setLastName(String value);
    String getDescription();
    void setDescription(String value);
    //
}
