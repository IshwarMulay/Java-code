import java.util.Scanner;

class SchoolReportCard{
public static void main(String []args){		

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Marks of 1st sub :");
	int sub1 = sc.nextInt();

	System.out.print("Enter Marks of 2nd sub :");
	int sub2 = sc.nextInt();

	System.out.print("Enter Marks of 3rd sub :");
	int sub3 = sc.nextInt();

	System.out.print("Enter Marks of 4th sub :");
	int sub4 = sc.nextInt();

	System.out.print("Enter Marks of 5th sub :");
	int sub5 = sc.nextInt();

	int marks_obtaind  = sub1 + sub2 + sub3 + sub4 + sub5;

	int total_marks = 500;

	double per = (marks_obtaind*100)/total_marks;

	System.out.println("Percentage = " +per);

	char grade = (per<=100 && per>=85)?('A'):((per<=85 && per>65)?('B'):((per<=65 && per>45)?('C'):((per<=45 && per>35)?('E'):('F'))));
	System.out.println("Grade = " + grade);
	String remark = (grade=='A')?("Very Good"):((grade=='B')?("Good"):((grade=='C')?("Need to improve"):((grade=='E')?("Work Hard"):("Enjoy"))));

	System.out.println("Remark = " + remark);

		System.out.println("**********************************************************************************************************");
	System.out.println("                                                          Littel Flower");
	System.out.println("                                                        Maharashtra Board");
	System.out.println(" ");
	System.out.println("Name: Ishwar Kantilal Mulay                                                               Date: 21/02/24");
	System.out.println(" ");
	System.out.println("Roll No: 76                                                  Sec- B                       Exam- End Sem");
	System.out.println(" ");
	System.out.println("**********************************************************************************************************");

	System.out.println();
	System.out.println("  Subject                                                  Total Marks                     Marks Obtained");
	System.out.println();
	System.out.println("1.Physics                                                     100                              "+sub1);
	System.out.println("----------------------------------------------------------------------------------------------------------");
	System.out.println("2.Maths                                                       100                              "+sub2);
	System.out.println("----------------------------------------------------------------------------------------------------------");
	System.out.println("3.Chemistry                                                   100                              "+sub3);
	System.out.println("----------------------------------------------------------------------------------------------------------");
	System.out.println("4.Science                                                     100                              "+sub4);
	System.out.println("----------------------------------------------------------------------------------------------------------");
	System.out.println("5.Histry                                                      100                              "+sub5);
	System.out.println("----------------------------------------------------------------------------------------------------------");
	System.out.println();
	System.out.println("Total Marks= "+total_marks +"                                                                      Marks Obtained= " +marks_obtaind);
        System.out.println();
	System.out.println("Percentage= "+per+ "                                                                             Grade= "+grade);
	System.out.println();
	System.out.println("Remark- "+remark+  "                                                                         Signature- #$%&*");
	System.out.println();
	System.out.println("**********************************************************************************************************");



}


}