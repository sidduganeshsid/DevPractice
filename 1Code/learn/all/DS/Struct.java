// A struct in C just like a class in Java and much more powerful, because class in Java can contain method, and C++ does. You create a new class. For example :

   class Employee {
       private String name;
       private int code;

   // constructor
   public Employee(String name, int code) {
      this.name = name;
      this.code = code;
   }

       // getter
       public String getName() { return name; }
       public int getCode() { return code; }
       // setter

       public void setName(String name) { this.name = name; }
       public void setCode(int code) { this.code = code; }
    }
// And when you want to create multi employees, create array just like in C:

// Employee[] arr = new Employee[100];  // new stands for create an array object
// arr[0] = new Employee("Peter", 100); // new stands for create an employee object
// arr[1] = new Employee("Mary", 90);