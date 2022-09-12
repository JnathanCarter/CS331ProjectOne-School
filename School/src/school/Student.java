package school;

/**
 *
 * @author johnc && maurzel
 */
class TestScore {

        private int test1;
        private int test2;
        private int test3;

        // constructor
        public TestScore(int t1, int t2, int t3) {
                test1 = t1;
                test2 = t2;
                test3 = t3;
        }

        // setters
        public void setTest1(int testScore) {
                this.test1 = testScore;
        }

        public void setTest2(int testScore) {
                this.test2 = testScore;
        }

        public void setTest3(int testScore) {
                this.test3 = testScore;
        }

        // getters
        public int getTest1();{
                return test1;
        }
        public int getTest2();{
                return test2;
        }
        public int getTest3();{
                return test3;
        }
        public String toString() {
                double average = (test1 + test2 + test3) / 3.0;
                result ="\nTest1 Score: "+ test1 + "\n";
                result += "Test2 Score: "+ test2 + "\n";
                result += "Test3 Score: "+ test3 + "\n";
                result += "Average Test Score: " + average;
                return result;
        }
}               

public class Student {

        private String firstName, lastName;
        private Address homeAddress, schoolAddress;
        private TestScore test;

        public Student(String first, String last, Address home, Address school) {
                this.firstName = first;
                this.lastName = last;
                this.homeAddress = home;
                this.schoolAddress = school;
                TestScore test = new TestScore(0, 0, 0);
        }

        // overloaded constructor
        public Student(String first, String last, Address home, Address school, int t1, int t2, int t3) {
                this.firstName = first;
                this.lastName = last;
                this.homeAddress = home;
                this.schoolAddress = school;
                TestScore test = new TestScore(t1, t2, t3);

        }

        public String toString() {
                String result;
                result = this.firstName + " " + this.lastName + "\n";
                result += "Home Address: \n" + homeAddress + "\n";
                result += "School address: \n" + schoolAddress;
                return result;
        }

        public void setTestScore(int testNumber, int testScore) {
                if (testNumber == 1) {
                        test.setTest1(testScore);
                } else if (testNumber == 2) {
                        test.setTest2(testScore);
                } else {
                        test.setTest3(testScore);
                }

        }

        public int getTestScore(int testNumber) {
                if (testNumber == 1) {
                        return test.getTest1();
                } else if (testNumber == 2) {
                        return test.getTest2();
                } else {
                        return test.getTest3();
                }

        }

}
