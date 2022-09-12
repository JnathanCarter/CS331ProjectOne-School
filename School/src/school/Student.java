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
public class Student {
        private String firstName, lastName;

        private Address homeAddress, schoolAddress;

        public Student(String first, String last, Address home, Address school) {
                this.firstName = first;
                this.lastName = last;
                this.homeAddress = home;
                this.schoolAddress = school;
        }

        public String toString() {
                String result;
                result = this.firstName + " " + this.lastName + "\n";
                result += "Home Address: \n" + homeAddress + "\n";
                result += "School address: \n" + schoolAddress;
                return result;
        }
}
