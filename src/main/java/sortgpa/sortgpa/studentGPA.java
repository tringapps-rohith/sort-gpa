package sortgpa.sortgpa;
class StudentGPA
{
        String name;
        int age;
        double gpa;
        public StudentGPA(String name,int age,double gpa)
        {
                this.name=name;
                this.age=age;
                this.gpa=gpa;
        }
        public StudentGPA()
        {
        }
        public void setName(String name)
        {
                this.name=name;
        }
        public String getName()
        {
                return this.name;
        }
        public void setAge(int age)
        {
                this.age=age;
        }
        public int getAge()
        {
                return this.age;
        }
        public void setGPA(double gpa)
        {
                this.gpa=gpa;
        }
        public double getGPA()

        {
                return this.gpa;
        }
        public String toString(){
                return this.name+" "+this.age+" "+this.gpa;
        }
}
