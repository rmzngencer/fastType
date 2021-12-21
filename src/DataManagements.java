import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;


public class DataManagements {

        static String filename = "data.txt";
        static int limitRecord = 10000;
        static Record[] records;
        static int lastIndex;

        static class Record {
            String name, surname;
            Integer id, age, gamescore;
        }


         static void listRecord() {
            File file = new File(filename);
            try {
                Scanner lister = new Scanner(file);
                while (lister.hasNextLine()) {
                    String line = lister.nextLine();
                    System.out.println(line);
                }
                lister.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            initialProcess();
        }

         static void addRecord(String name,String surname, Integer age,Integer gamescore, Integer id) {
             try {
                 BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true));
                 bw.write(name + "\t" + surname + "\t" + age+ "\t" + gamescore + "\t" + id );
                 bw.newLine();
                 bw.close();
                 System.out.println("Record is added.");
             } catch (IOException ex) {
                 System.out.println("Record is Not added.");
             }
             initialProcess();
         }


        private static void initialProcess() {
            records = new Record[limitRecord];
            for (int i = 0; i < limitRecord; i++) {
                records[i] = new Record();
            }
            try {
                Reader reader = new InputStreamReader(new FileInputStream(filename), "Windows-1254");
                BufferedReader br = new BufferedReader(reader);
                String strLine;
                int i = 0;
                while ((strLine = br.readLine()) != null) {
                    StringTokenizer tokens = new StringTokenizer(strLine, "\t");
                    String[] t = new String[5];
                    int j = 0;
                    while (tokens.hasMoreElements()) {
                        t[j] = tokens.nextToken();
                        j++;
                    }
                    records[i].name = t[0];
                    records[i].surname =t[1];
                    records[i].age = Integer.valueOf(t[2]);
                    records[i].gamescore = Integer.valueOf(t[3]);
                    records[i].id = Integer.valueOf(t[4]);
                    i++;
                }
                lastIndex = i;
                reader.close();
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }

