import java.io.*;

public class Main {
    private static final String FILE_NAME = "myfile.txt";

    public static void main(String[] args) {
//        Student s1 = new Student();
//        s1.setFacultyNumber("123124");
//        s1.setName("Bai Ivan");
//        s1.setEmail("BaiIvan@abv.bg");

        Student s2 = deserializeStudent();
        System.out.println(s2.getEmail());
    }

    public static void externalizeTeacher(Teacher teacher) {
        try (FileOutputStream fileOutput = new FileOutputStream(FILE_NAME);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOutput);) {
            objectOut.writeObject(teacher);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Student deserializeStudent() {
        Student result = null;
        try (FileInputStream fileOutput = new FileInputStream(FILE_NAME);
             ObjectInputStream objectOut = new ObjectInputStream(fileOutput);) {
            result = (Student)objectOut.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static void serializeStudent(Student student) {
        try (FileOutputStream fileOutput = new FileOutputStream(FILE_NAME);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOutput);) {
            objectOut.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToAFile(String fileName) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
            String fileContent = "Some text here";
            bufferedWriter.write(fileContent);
        } catch (IOException e) {
            // Exception handling​
        }
    }

    public static String readStringFromAFile(String fileName) {
        String result = "";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println("I am from 25: " + line);
                result += line;
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            // Exception handling
        } catch (IOException e) {
            // Exception handling
        }

        return result;
    }
}