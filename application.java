import java.util.Scanner;
import java.util.ArrayList;

class Course {
    String name;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class User {
    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.println("Are you an instructor or a student?");
        String userType = scanner.nextLine();

        if (userType.equalsIgnoreCase("student")) {
          
            System.out.println("Enter your username:");
            String username = scanner.nextLine();
            System.out.println("Enter your password:");
            String password = scanner.nextLine();

          
            User[] students = {
                new User("abdelrhman emad", "abdo1111")
            };

            boolean isAuthenticated = false;
            for (User student : students) {
                if (student.getUsername().equalsIgnoreCase(username) && student.getPassword().equals(password)) {
                    isAuthenticated = true;
                    break;
                }
            }

            if (isAuthenticated) {
                ArrayList<Course> courses = new ArrayList<>();
                courses.add(new Course("Machine Learning"));
                courses.add(new Course("Web Development"));
                courses.add(new Course("Data Science"));
                courses.add(new Course("Java Programming"));

                System.out.println("Available Courses:");
                for (Course course : courses) {
                    System.out.println(course.getName());
                }
            } else {
                System.out.println("Invalid username or password.");
            }
        } else if (userType.equalsIgnoreCase("instructor")) {
            System.out.println("Enter your username:");
            String username = scanner.nextLine();
            System.out.println("Enter your password:");
            String password = scanner.nextLine();
            User[] instructors = {
                new User("instructor1", "password1")
            };

            boolean isAuthenticated = false;
            for (User instructor : instructors) {
                if (instructor.getUsername().equalsIgnoreCase(username) && instructor.getPassword().equals(password)) {
                    isAuthenticated = true;
                    break;
                }
            }

            if (isAuthenticated) {
              
                System.out.println("List of Students:");
                System.out.println("std1");
                System.out.println("std2");
                System.out.println("std3");
                System.out.println("std4");
            } else {
                System.out.println("Invalid username or password.");
            }
        } else {
            System.out.println("Invalid user type.");
        }

        scanner.close();
    }
}

