package com.javarush.test.level20.lesson02.task02;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* Читаем и пишем в файл: JavaRush
Реализуйте логику записи в файл и чтения из файла для класса JavaRush
В файле your_file_name.tmp может быть несколько объектов JavaRush
Метод main реализован только для вас и не участвует в тестировании
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream("d:\\f1");
            InputStream inputStream = new FileInputStream("d:\\f1");
            SimpleDateFormat date = new SimpleDateFormat("dd.mm.yyyy", Locale.ENGLISH);
            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User one = new User();
            one.setFirstName("Ivan");one.setLastName("Ivanov");one.setBirthDate(null);one.setMale(true); one.setCountry(User.Country.RUSSIA);
            User two = new User();
            two.setFirstName("Peter");two.setLastName("Petrow");two.setBirthDate(date.parse("22.02.2002"));two.setMale(false); two.setCountry(User.Country.OTHER);
            javaRush.users.add(null);
            javaRush.users.add(null);
            javaRush.users.add(one);
            javaRush.users.add(two);

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter pr = new PrintWriter(outputStream);
            SimpleDateFormat sdf = new SimpleDateFormat("dd.mm.yyyy", Locale.ENGLISH);
            for (User x : users) {
                pr.println("@");
                if (x != null) {
                    if (x.getFirstName()!= null){pr.println(x.getFirstName());}else {pr.println("--");}
                    if (x.getLastName()!= null){pr.println(x.getLastName());}else {pr.println("--");}
                    if (x.getBirthDate()!= null){pr.println(sdf.format(x.getBirthDate()));}else {pr.println("--");}
                    if (x.isMale()== true){pr.println("true");} else pr.println("--");
                    if (x.getCountry()!= null){pr.println(x.getCountry());}else {pr.println("--");}
                }
                else {
                pr.println("#");}
            }
            pr.close();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            SimpleDateFormat sdf = new SimpleDateFormat("dd.mm.yyyy", Locale.ENGLISH);
            while (br.ready()) {
                if (br.readLine().equals("@")) {

                    String n = br.readLine();
<<<<<<< HEAD
//                    if (n)
                    if (!n.equals("--")){tmp.setFirstName(n);}
                    String l = br.readLine();if (!l.equals("--")){tmp.setLastName(l);}
                    String b = br.readLine();
                    if (!b.equals("--")){tmp.setBirthDate(sdf.parse(b));}
                    String m = br.readLine();if (m.equals("true")){tmp.setMale(true);}
                    String c = br.readLine();if (!c.equals("--")){tmp.setCountry(User.Country.valueOf(c));}
                    this.users.add(tmp);
=======
                    if (!n.equals("#")) {
                        User tmp = new User();
                        if (!n.equals("--")){tmp.setFirstName(n);}
                        String l = br.readLine();if (!l.equals("--")){tmp.setLastName(l);}
                        String b = br.readLine();
                        if (!b.equals("--")){tmp.setBirthDate(sdf.parse(b));}
                        String m = br.readLine();if (m.equals("true")){tmp.setMale(true);}
                        String c = br.readLine();if (!c.equals("--")){tmp.setCountry(User.Country.valueOf(c));}
                        this.users.add(tmp);
                    }
                    else {
                        this.users.add(null);
                    }
>>>>>>> origin/master
                }
            }

        }
    }
}
