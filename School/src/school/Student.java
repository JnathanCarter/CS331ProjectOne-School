
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
        private TestScore test;

        public Student(String first, String last, Address home, Address school) {
                this.firstName = first;
                this.lastName = last;
                this.homeAddress = home;
                this.schoolAddress = school;
                test = new Testscore(0, 0, 0);
        }

        // overloaded constructor
        public Student(String first, String last, Address home, Address school, int t1, int t2, int t3) {
                this.firstName = first;
                this.lastName = last;
                this.homeAddress = home;
                this.schoolAddress = school;
                test = new Testscore(t1, t2, t3);

        }

        public String toString() {
                String result;
                result = this.firstName + " " + this.lastName + "\n";
                result += "Home Address: \n" + homeAddress + "\n";
                result += "School address: \n" + schoolAddress;
                return result;
        }

        public void setTestScore(int testNumber, int testScore) {
                if(testNumber == 1){
                        test.setTest1(testScore);
                } else if (testNumber == 2){
                        test.setTest2(testscore);
                } else {
                        test.setTest3(testScore)
                }
                }

        public int getTestScore(int testNumber) {
                int result = 0;

                return result;
        }

        public double average() {
                double result = 0;
                return result;

        }
}
