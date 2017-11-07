/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.College;
import Business.CollegeCatalog;
import Business.Course;
import Business.CourseOffering;
import Business.Degree;
import Business.Department;
import Business.DepartmentCatalog;
import Business.Student;
import Business.University;
import Business.UniversityCatalog;
import Initialization.Initialization;
import Initialization.Methods;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Eric
 */
public class Main {
    
    public static void main(String[] args) { 
        
//        String keyword01;
//        String keyword02;
//        String keyword03;
//        String keyword04;
        
        System.out.println("***************************************Welcome to the EDUCATION LEVEL ECOSYSTEM***************************************");
        System.out.println("***************************************Please enter the choice below for Reports***************************************");
        
        System.out.println("1. University Level Reprots");
        System.out.println("2. College Level Reprots");
        System.out.println("3. Department Level Reprots");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        
        System.out.println("************************************Enter a choice******************************************");
        int choice = reader.nextInt(); // Scans the next token of the input as an int.
        System.out.println("********************************************************************************************");
        
        switch (choice) {
            case 1:
                System.out.println("ID   " + "UniversityName  ");
                
                for(University university : Initialization.Initialization().getUniversityCatalog()){
                System.out.print(university.getUniversityID() + "    ");
                System.out.println(university.getUniversityName());
                }
                
                System.out.println("************************************Enter a choice******************************************");
                
                int choice_1 = reader.nextInt(); // Scans the next token of the input as an int.
                System.out.println("********************************************************************************************");
                switch(choice_1){
                    case 1:
                        System.out.println("1. University StudentDirectory Report;");
                        System.out.println("2. University CollegeDirectory Report;");
                        System.out.println("3. University Profitable Report;");
                        System.out.println("************************************Enter a choice******************************************");
                        
                        int choice_1_1 = reader.nextInt(); // Scans the next token of the input as an int.
                        System.out.println("********************************************************************************************");
                        switch (choice_1_1){
                            case 1:
                                System.out.println("ID   " + "FirstName  " + "LastName  " + "Gender  " + "BirthDate    " + "Email      " + "Address        " + "ZipCode  " + "Department  " + "College  " + "University  ");
                                for(Student student : Initialization.Initialization_Student().getStudentDiredtory()){
                                    if(student.getUniversityName().equals("NEU")){
                                        System.out.print(student.getStudentID() + "    ");
                                        System.out.print(student.getFirstName() + "    ");
                                        System.out.print(student.getLastName() + "     ");
                                        System.out.print(student.getGender() + "       ");
                                        System.out.print(student.getDateOfBirth() + "   ");
                                        System.out.print(student.getEmail() + "    ");
                                        System.out.print(student.getAddress() + "    ");
                                        System.out.print(student.getZipcode() + "    ");
                                        System.out.print(student.getDepartmentName() + "        ");
                                        System.out.print(student.getCollegeName() + "      ");
                                        System.out.println(student.getUniversityName());
                                    }
                                }
                                System.out.println("********************************************************************************************");
                            break;
                            case 2:
                                System.out.println("ID   " + "CollegeName  ");
                        
                                for(College college : Initialization.Initialization().getUniversityCatalog().get(0).getCollegeCatalog().getCollegeCatalog()){
                                System.out.print(college.getCollegeID() + "    ");
                                System.out.println(college.getCollegeName());
                                }
                                System.out.println("********************************************************************************************");
                            break;
                            case 3:
                                System.out.println("Input   " + "Output  " + "profitable  ");
                                System.out.print(Methods.Initialization_Profit_1() + "     ");
                                System.out.print(Methods.Initialization_Profit_2() + "     ");
                                if(Integer.parseInt(Methods.Initialization_Profit_1()) > Integer.parseInt(Methods.Initialization_Profit_2())){
                                    System.out.println("True");
                                } else {
                                    System.out.println("False");
                                }
                                System.out.println("********************************************************************************************");
                                
                            break;
                        }
                    break;
                    
                    case 2:
                    break;
                }
            break;
            
            
            
            
            
                
            case 2:
                System.out.println("ID   " + "UniversityName  ");
                
                for(University university : Initialization.Initialization().getUniversityCatalog()){
                System.out.print(university.getUniversityID() + "    ");
                System.out.println(university.getUniversityName());
                }
                
                System.out.println("************************************Enter a choice******************************************");
                
                int choice_2 = reader.nextInt(); // Scans the next token of the input as an int.
                System.out.println("********************************************************************************************");
                switch(choice_2){
                    
                    case 1:
                        System.out.println("ID   " + "CollegeName  ");
                        
                        for(College college : Initialization.Initialization().getUniversityCatalog().get(0).getCollegeCatalog().getCollegeCatalog()){
                        System.out.print(college.getCollegeID() + "    ");
                        System.out.println(college.getCollegeName());
                        }
                        System.out.println("************************************Enter a choice******************************************");
                        
                        int choice_2_1 = reader.nextInt(); // Scans the next token of the input as an int.
                        System.out.println("********************************************************************************************");
                        switch(choice_2_1){
                            case 1:
                                System.out.println("1. College StudentDirectory Report;");
                                System.out.println("2. College DepartmentDirectory Report;");
                                System.out.println("3. Other Reports;");
                                System.out.println("********************************************************************************************");
                            
                                int choice_2_1_1 = reader.nextInt(); // Scans the next token of the input as an int.
                                System.out.println("********************************************************************************************");
                                switch(choice_2_1_1){
                                    case 1:
                                        System.out.println("ID   " + "FirstName  " + "LastName  " + "Gender  " + "BirthDate    " + "Email      " + "Address        " + "ZipCode  " + "Department  " + "College  " + "University  ");
                                        for(Student student : Initialization.Initialization_Student().getStudentDiredtory()){
                                            if(student.getUniversityName().equals("NEU") && student.getCollegeName().equals("COE")){
                                                System.out.print(student.getStudentID() + "    ");
                                                System.out.print(student.getFirstName() + "    ");
                                                System.out.print(student.getLastName() + "     ");
                                                System.out.print(student.getGender() + "       ");
                                                System.out.print(student.getDateOfBirth() + "   ");
                                                System.out.print(student.getEmail() + "    ");
                                                System.out.print(student.getAddress() + "    ");
                                                System.out.print(student.getZipcode() + "    ");
                                                System.out.print(student.getDepartmentName() + "        ");
                                                System.out.print(student.getCollegeName() + "      ");
                                                System.out.println(student.getUniversityName());
                                            }
                                        }
                                    break;
                                    case 2:
                                        System.out.println("ID   " + "DepartmentName  ");
                                        for(Department department : Initialization.Initialization().getUniversityCatalog().get(0).getCollegeCatalog().getCollegeCatalog().get(0).getDepartmentcatalog().getDepartmentCatalog()){
                                        System.out.print(department.getDepartmentID() + "    ");
                                        System.out.println(department.getDepartmentName());
                                        }
                                    break;
                                    case 3: 
                                        System.out.println("Total Student Number");
                                        System.out.println("4");
                                        System.out.println("********************************************************************************************");
                                        System.out.println("Total Teacher Number");
                                        System.out.println("12");
                                        System.out.println("********************************************************************************************");
                                        System.out.println("Total Course Number");
                                        System.out.println("12");
                                    break;
                                }
                                
                            break;
                            case 2:
                            break; 
                        }
                    break;
                    
                    case 2:
                    break;
                }
            break;
            
            
            
            
            
                
            case 3:
                System.out.println("ID   " + "UniversityName  ");
                
                for(University university : Initialization.Initialization().getUniversityCatalog()){
                System.out.print(university.getUniversityID() + "    ");
                System.out.println(university.getUniversityName());
                }
                
                System.out.println("************************************Enter a choice******************************************");
            
                int choice_3 = reader.nextInt(); // Scans the next token of the input as an int.
                System.out.println("********************************************************************************************");
                switch(choice_3){
                    
                    case 1:
                        System.out.println("ID   " + "CollegeName  ");
                        
                        for(College college : Initialization.Initialization().getUniversityCatalog().get(0).getCollegeCatalog().getCollegeCatalog()){
                        System.out.print(college.getCollegeID() + "    ");
                        System.out.println(college.getCollegeName());
                        }
                        System.out.println("************************************Enter a choice******************************************");
                    
                        int choice_3_1 = reader.nextInt(); // Scans the next token of the input as an int.
                        System.out.println("********************************************************************************************");
                        switch(choice_3_1){
                            case 1:
                                System.out.println("ID   " + "DepartmentName  ");
                                for(Department department : Initialization.Initialization().getUniversityCatalog().get(0).getCollegeCatalog().getCollegeCatalog().get(0).getDepartmentcatalog().getDepartmentCatalog()){
                                System.out.print(department.getDepartmentID() + "    ");
                                System.out.println(department.getDepartmentName());
                                }
                                System.out.println("************************************Enter a choice******************************************");
                                
                                int choice_3_1_1 = reader.nextInt(); // Scans the next token of the input as an int.
                                System.out.println("********************************************************************************************");
                                switch(choice_3_1_1){
                                    case 1:
                                        System.out.println("1. Department StudentDirectory Report;");
                                        System.out.println("2. CourseCataLog Report;");
                                        System.out.println("3. Degree Report;");
                                        System.out.println("4. CourseOffering Report;");
                                        System.out.println("5. Other Reports;");
                                        System.out.println("********************************************************************************************");
                            
                                        int choice_3_1_1_1 = reader.nextInt(); // Scans the next token of the input as an int.
                                        System.out.println("********************************************************************************************");
                                        switch(choice_3_1_1_1){
                                            case 1:
                                                System.out.println("ID   " + "FirstName  " + "LastName  " + "Gender  " + "BirthDate    " + "Email      " + "Address        " + "ZipCode  " + "Department  " + "College  " + "University  ");
                                                for(Student student : Initialization.Initialization_Student().getStudentDiredtory()){
                                                    if(student.getUniversityName().equals("NEU") && student.getCollegeName().equals("COE") && student.getDepartmentName().equals("IS  ")){
                                                    System.out.print(student.getStudentID() + "    ");
                                                    System.out.print(student.getFirstName() + "    ");
                                                    System.out.print(student.getLastName() + "     ");
                                                    System.out.print(student.getGender() + "       ");
                                                    System.out.print(student.getDateOfBirth() + "   ");
                                                    System.out.print(student.getEmail() + "    ");
                                                    System.out.print(student.getAddress() + "    ");
                                                    System.out.print(student.getZipcode() + "    ");
                                                    System.out.print(student.getDepartmentName() + "        ");
                                                    System.out.print(student.getCollegeName() + "      ");
                                                    System.out.println(student.getUniversityName());
                                                    }
                                                }
                                            break;
                                            
                                            case 2:
                                                System.out.println("ID   " + "CourseName  " + "Credit  " + "Price  " + "Type   " + "Department   " + "Prerequest  " + "Followup  ");
                                                for(Course course : Initialization.Initialization().getUniversityCatalog().get(0).getCollegeCatalog().getCollegeCatalog().get(0).getDepartmentcatalog().getDepartmentCatalog().get(0).getDegreeCatalog().getDegreeCatalog().get(0).getCourseList()){
                                                    System.out.print(course.getCourseID() + "    ");
                                                    System.out.print(course.getCourseName() + "  ");
                                                    System.out.print(course.getCourseCredit() + "      ");
                                                    System.out.print(course.getCoursePrice() + "     ");
                                                    System.out.print(course.getCourseType() + "        ");
                                                    System.out.print(course.getCourseDepartment() + " ");
                                                    System.out.print(course.getCoursePrerequest() + " ");
                                                    System.out.println(course.getCourseFollowup());
                                                }
                                                for(Course course : Initialization.Initialization().getUniversityCatalog().get(0).getCollegeCatalog().getCollegeCatalog().get(0).getDepartmentcatalog().getDepartmentCatalog().get(0).getDegreeCatalog().getDegreeCatalog().get(1).getCourseList()){
                                                    System.out.print(course.getCourseID() + "    ");
                                                    System.out.print(course.getCourseName() + "  ");
                                                    System.out.print(course.getCourseCredit() + "      ");
                                                    System.out.print(course.getCoursePrice() + "     ");
                                                    System.out.print(course.getCourseType() + "        ");
                                                    System.out.print(course.getCourseDepartment() + " ");
                                                    System.out.print(course.getCoursePrerequest() + " ");
                                                    System.out.println(course.getCourseFollowup());
                                                }
                                                
                                            case 3:
                                                System.out.println("ID   " + "DegreeName     " + "Requirement     " + "degreeRelated");
                                                for(Degree degree : Initialization.Initialization().getUniversityCatalog().get(0).getCollegeCatalog().getCollegeCatalog().get(0).getDepartmentcatalog().getDepartmentCatalog().get(0).getDegreeCatalog().getDegreeCatalog()){
                                                    System.out.print(degree.getDegreeID() + "    ");
                                                    System.out.print(degree.getDegreeName() + "  ");
                                                    System.out.print(degree.getDegreeRequirement() + "        ");
                                                    System.out.println(degree.getDegreeRelated());
                                                }
                                            break;
                                            
                                            case 4:
                                                System.out.println("ID   " + "CourseName  " + "Buliding  " + "Room  " + "TeacherID   " + "Year   " + "Season");
                                                for(CourseOffering courseoffering : Initialization.Initialization().getUniversityCatalog().get(0).getCollegeCatalog().getCollegeCatalog().get(0).getDepartmentcatalog().getDepartmentCatalog().get(0).getDepartmentCourseList().getDepartmentCourseSchedule()){
                                                    System.out.print(courseoffering.getCourseOfferingID() + "     ");
                                                    System.out.print(courseoffering.getCourseName() + "  ");
                                                    System.out.print(courseoffering.getBuilding() + "         ");
                                                    System.out.print(courseoffering.getRoom() + "     ");
                                                    System.out.print(courseoffering.getTeacherID() + "       ");
                                                    System.out.print(courseoffering.getYear() + "    ");
                                                    System.out.println(courseoffering.getSeason());
                                                }
                                            break;
                                            
                                            case 5:
                                                System.out.println("Total Student Number");
                                                System.out.println("2");
                                                System.out.println("********************************************************************************************");
                                                System.out.println("Total Teacher Number");
                                                System.out.println("6");
                                                System.out.println("********************************************************************************************");
                                                System.out.println("Total Course Number");
                                                System.out.println("6");
                                                System.out.println("********************************************************************************************");
                                                System.out.println("Student Average GPA");
                                                System.out.println("********************************************************************************************");
                                                System.out.println("StudentID  " + "GPA  ");
                                                System.out.println("    1  " + "    3.7  ");
                                                System.out.println("    2  " + "    3.5  ");
                                            break;
                                                
                                                }
                                        
                                            break;
                                        }
                                        break;
                                    case 2:
                                    break;
                            }
                            break;
                    case 2:
                    break;
                }
                        
            break;
        }
    
    }
}

