package lr5.Example33;

class Example3 {
    // классом , у которого есть два целочисленных поля
    private int num1;
    private int num2;

    //конструктор , позволяющий создавать объекты без передачи аргументов
    Example3() {
        System.out.println("Конструирование без передачи аргументов");
    }

    //конструктор, позволяющий создавать объекты с передачей одного аргумента
    Example3(int num1){
            System.out.println("Конструирование с передачей 1 аргумента");
            this.num1 = num1;
            System.out.println("num1 = " +(num1));
    }
    //конструкор, позволяющий создавать объекты с передачей двух аргументов
    Example3(int num1,int num2){
        System.out.println("Конструирование объекта Example3(3)");
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("num1 * num2 = " + num1*num2);
    }
}

