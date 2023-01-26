package lr5.Example33;

class Example3 {
    // классом , у которого есть два целочисленных поля
    private int num1;
//первое целочисленное поле
    private int num2;
//второе целочисленное поле
    Example3() {
        System.out.println("Конструирование без передачи аргументов");
    }
//констуктор, позволяющий создавать объекты безе передапачи аргументов
    Example3(int num1){
            System.out.println("Конструктор с 1 аргументом");
            this.num1 = num1;
            System.out.println("num1 = " + num1);
    }
//конструктор, позволяющий создавать объекты с передачей одного аргумента
    Example3(int num1,int num2){
        System.out.println("Конструктор c 2 аргументами");
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("num1 * num2 = " + num1 * num2);
    }
//конструктор, позволяющий создавать объекты с передачей двух аргументов
}

