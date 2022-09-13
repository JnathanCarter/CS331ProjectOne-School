/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

/**
 *
 * @author johnc
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Address homeAddress1 = new Address("452 Church ave", "Anniston", "AL", 36207);
        Address schoolAddress1 = new Address("1600 Pelham Rd", "Jacksonville", "AL", 36265);

        Address homeAddress2 = new Address("507 Snow Street", "Oxford", "AL", 36203);
        Address schoolAddress2 = new Address("1600 Pelham Rd", "Jacksonville", "AL", 36265);

        // student with default 0
        Student s1 = new Student("Jonathan", "Carter", homeAddress1, schoolAddress1);

        // student with grades in constructor
        Student s2 = new Student("Maurzel", "Castleberry", homeAddress2, schoolAddress2, 12, 80, 88);

        // Print initial values
        System.out.println(
                "Initial Value-----------\n\nSTUDENT ONE-----\n" + s1.toString() + "\n\nSTUDNENT2------------\n"
                        + s2.toString());

        // change grades to the same for both student
        s1.setTestScore(1, 88);
        s1.setTestScore(2, 75);
        s1.setTestScore(3, 92);

        s2.setTestScore(1, 88);
        s2.setTestScore(2, 75);
        s2.setTestScore(3, 92);

        // print values after changing the grades
        System.out.println("Values after using set testScore methods" + "\n\nSTUDENT ONE-----\n" + s1.toString()
                + "\n\nSTUDNENT2------------\n"
                + s2.toString());

    }

}
