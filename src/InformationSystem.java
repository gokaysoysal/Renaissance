public class InformationSystem {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "555");
        Teacher t2 = new Teacher("Kul Yutmaz", "BIO", "444");
        Teacher t3 = new Teacher("Badi Ekrem", "BDN", "333");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course biology = new Course("Biyoloji", "102", "BIO");
        biology.addTeacher(t2);
        Course beden = new Course("Beden", "101", "BDN");
        beden.addTeacher(t3);

        Student s1 = new Student("Guduk Necmi", "123", "4", tarih, biology, beden);
        s1.addBulkExamNote(100, 50, 40);
        s1.isPass();
        Student s2 = new Student("Inek Saban", "321", "4", tarih, biology, beden);
        s2.addBulkExamNote(70, 80, 60);
        s2.isPass();
        Student s3 = new Student("Damat Ferit", "234", "4", tarih, biology, beden);
        s3.addBulkExamNote(60, 55, 75);
        s3.isPass();
    }
}
