class Main {
    public static void main(String[] args) {
        ///////////////// 1) Bank Management System
        BankAccount account1 = new BankAccount("John Doe", 1001, 5000.0);
        BankAccount account2 = new BankAccount("Jane Doe", 1002, 7000.0);
        
        System.out.println("account1 is an instance of BankAccount: " + (account1 instanceof BankAccount));
        System.out.println("account2 is an instance of BankAccount: " + (account2 instanceof BankAccount));

        Object invalidObject1 = new Object();

        System.out.println("invalidObject is an instance of BankAccount: " + (invalidObject1 instanceof BankAccount));
        System.out.println();

        account1.displayAccountDetails();
        System.out.println();
        account2.displayAccountDetails();
        System.out.println();
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());

        int num = 10; // To check the type of the data type - for primitive
        System.out.println(((Object)num).getClass().getSimpleName());
        
        
        
        //////////  2) Library Management System
        System.out.println("-------------------------------------");
        Book book1 = new Book("1234", "Just Die", "Aswin");
        Book book2 = new Book("2344", "All Yes", "Austin");
        
        System.out.println("book1 is an instance of Book: " + (book1 instanceof Book));
        System.out.println("book2 is an instance of Book: " + (book2 instanceof Book));
        
        Object invalidObject2 = new Object();

        System.out.println("invalidObject is an instance of Book: " + (invalidObject2 instanceof Book));
        System.out.println();

        book1.displayBookDetails();
        System.out.println();
        book2.displayBookDetails();
        System.out.println();
        System.out.println("Total Books: " + Book.getTotalBooks());
        
        //////////// 3) Employee Management System
        System.out.println("-----------------------------------");
        Employee emp1 = new Employee(101, "Alice", "Software Engineer");
        Employee emp2 = new Employee(102, "Bob", "Data Analyst");

        if (emp1 instanceof Employee) {
            emp1.displayEmployeeDetails();
        }
        
        if (emp2 instanceof Employee) {
            emp2.displayEmployeeDetails();
        }

        Employee.displayTotalEmployees();

        //////////// 4) Shopping Cart Management System
        System.out.println("-----------------------------------");
        Product product1 = new Product(101, "Laptop", 1200.0, 2);
        Product product2 = new Product(102, "Smartphone", 800.0, 3);
 
        product1.displayProductDetails();
        product2.displayProductDetails();

        Product.updateDiscount(15.0); 

        product1.displayProductDetails();
        product2.displayProductDetails();


        //////////// 5) University Student Management System
        System.out.println("-----------------------------------");
        Student student1 = new Student(101, "Alice", 'A');
        Student student2 = new Student(102, "Bob", 'B');

        student1.displayStudentDetails();
        student2.displayStudentDetails();

        student2.updateGrade('A');
        student2.displayStudentDetails();
        Student.displayTotalStudents();

        //////////// 6) Vehicle Registration System
        System.out.println("-----------------------------------");
        Vehicle vehicle1 = new Vehicle("Aswin", "Car", "1234");
        Vehicle vehicle2 = new Vehicle("Austin", "Truck", "12345");

        vehicle1.displayRegistrationDetails();
        vehicle2.displayRegistrationDetails();
        vehicle1.updateRegistrationFee(200);
        vehicle1.displayRegistrationDetails();
        Vehicle.displayTotalVehicles();


        //////////// 7) Hospital Management System
        System.out.println("-----------------------------------");
        Patient patient1 = new Patient("01", "Amit", 55, "Fever");
        Patient patient2 = new Patient("02", "Ashok", 34, "Head ache");

        patient1.displayPatientDetails(); 
        patient2.displayPatientDetails(); 
        Patient.getTotalPatients();       
    }
}
