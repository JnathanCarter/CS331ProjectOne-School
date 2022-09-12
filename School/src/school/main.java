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

        Student s1 = new Student("Jonathan", "Carter", homeAddress1, schoolAddress1);
        Student s2 = new Student("Maurzel", "Castleberry", homeAddress2, schoolAddress2, 12, 80, 88);

        System.out.println("Initial Value-----------\n" + s1.toString() + "\n" + s2.toString());

    }

}
