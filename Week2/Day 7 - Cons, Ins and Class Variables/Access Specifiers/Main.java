class Main {
    public static void main(String[] args) {
        PostGraduateStudent p1 = new PostGraduateStudent("Ra2111", "Aswin", 9);
        System.out.println("Roll Number: " + p1.rollNumber);
        System.out.println("Name: " + p1.name);
        p1.getCGPA();

        System.out.println("------------------------------");
        EBook ebook = new EBook("23444", "All of us", "Anil Gel");
        System.out.println("ISBN: " + ebook.ISBN);
        System.out.println("Title: " + ebook.title);
        ebook.getAuthor();

        System.out.println("------------------------------");
        SavingsAccount acc = new SavingsAccount("123456", "Austin Aswin", 100000);
        System.out.println("Account Number: " + acc.accountNumber);
        System.out.println("Account Holder: " + acc.accountHolder);
        acc.getBalance();
        acc.setBalance(100);
        acc.getBalance();

        System.out.println("------------------------------");
        Manager m1 = new Manager("1234", "Maths", 1000);
        System.out.println("Employee ID: " + m1.empID);
        System.out.println("Department: " + m1.department);
        m1.getSalary();
        m1.setSalary(2000);
        m1.getSalary();


    }   
}   

