package sortgpa.sortgpa;

import java.util.*;
import java.util.logging.*;
class StudentTest
{
        public static void main(String...args)
        {
                Scanner sin=new Scanner(System.in);
				Logger l=Logger.getLogger("com.api.jar");
                l.info("Enter the no of students\n");
                int n=sin.nextInt();
		int res;
                StudentGPA [] s=new StudentGPA[n];
                for(int i=0;i<n;i++)
                {
                        res=i+1;
                        l.log(Level.INFO,()-> "\nStudent "+res+" details\n");
                        s[i]=new StudentGPA();
                        l.info("Enter name :");
                        String name=sin.next();
                        s[i].setName(name);
                        l.info("Enter age :");
                        int age=sin.nextInt();
                        s[i].setAge(age);
                        l.info("Enter GPA :");
                        double gpa=sin.nextDouble();
                        s[i].setGPA(gpa);
                }
                for(int i=0;i<n;i++)
                {
                         res=i+1;
                        l.log(Level.INFO,()->"\n\nStudent "+res+" details");
                        String d1="\nName :"+s[i].getName()+"\nAge :"+s[i].getAge()+"\nGPA :"+s[i].getGPA();
                        l.info(d1);
                }

                ArrayList<StudentGPA> al = new ArrayList<>();
                for(int i=0;i<n;i++)
                {
                        StudentGPA a=s[i];
                        al.add(a);
                }
                Collections.sort(al,new Comparator<StudentGPA>()
                                {
                                        public int compare(StudentGPA s1,StudentGPA s2)
                                        {
                                                if(s1.getGPA()<s2.getGPA())
                                                {
                                                        return 1;
                                                }
                                                else if(s1.getGPA()==s2.getGPA())
                                                {
                                                        return 0;
                                                }
						return -1;
					}
                                });
                l.info("\nStudents sorted by their GPA");
                for (int j=0;j<n;j++)
                {
			res=j+1;
                        String s12=" "+al.get(j);
			l.info(s12);
                }

        }
}
