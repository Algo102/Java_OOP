package org.DZ.DZ_6;



public class Main{
    public static void main(String[] args){

        Reporter report = new Reporter();
        Saver save = new Saver();

        User user1 = new User("Bob");
        report.report(user1);
        save.save(user1);

        System.out.println("------------------");

        User user2 = new User("Jon");
        report.report(user2);
        save.save(user2);

    }
}