class Product {
    String name;
    double price;

    public void getName(){
        System.out.println("Product Name: "+ name);
    }
    public void setName(String name){
        this.name = name;
    }
 
    public void getPrice(){
        System.out.println("Product Price: "+ price);
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void getInfo(){
        this.getName();
        this.getPrice();
    }
}

class Electronics extends Product{
    String brand;
    String model;
    
    public void getBrand(){
        System.out.println("Brand: "+ brand);
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    public void getModel(){
        System.out.println("Model: "+ model);
    }
    public void setModel(String model){
        this.model = model;
    }
    public void getInfo(){
        super.getInfo();
        this.getBrand();
        this.getModel();
    }
}

class Book extends Product{
    String author;
    int pages;

    public void getAuthor(){
        System.out.println("Author: "+ author);
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public void getPages(){
        System.out.println("Number of Pages: "+ pages);
    }
    public void setPages(int pages){
        this.pages = pages;
    }
    public void getInfo(){
        super.getInfo();
        this.getAuthor();
        this.getPages();
    }
}

class Smartphone extends Electronics {
    String OperatingSystem;

    public void getOperatingSystem(){
        System.out.println("Operating System: "+ OperatingSystem);
    }
    public void setOperatingSystem(String OperatingSystem){
        this.OperatingSystem = OperatingSystem;
    }
    public void getInfo(){
        super.getInfo();
        this.getOperatingSystem();
    }
}

class List {
    public static void main(String[] args) {
        Product P1 = new Product();
        P1.setName("chair");
        P1.setPrice(500.0);
        P1.getInfo();
        System.out.println("*****************************");
        Electronics E2 = new Electronics();
        E2.setName("Television");
        E2.setPrice(20000.0);
        E2.setBrand("Samsung");
        E2.setModel("Neo QLED");
        System.out.println("*****************************");
        Smartphone Sm3 = new Smartphone();
        Sm3.setName("Iphone");
        Sm3.setPrice(40000.0);
        Sm3.setBrand("Apple");
        Sm3.setModel("Iphone 99");
        Sm3.setOperatingSystem("ios");
        Sm3.getInfo();
        System.out.println("*****************************");
        Book B4 = new Book();
        B4.setName("OOP Programming");
        B4.setPrice(250.0);
        B4.setAuthor("John Doe");
        B4.setPages(300);
        B4.getInfo();
        System.out.println("*****************************");
    }
}