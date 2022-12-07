package lr4;

public class Example3 {
    public static void main(String[] args) {
        int figure = 2;
        int i;
        int j;
        int z;

        for (i = 1 ; i <= figure ; i++){
            System.out.print("номер строки:" +i+ " ");
            z=0;
            for (j=-12;j<figure;j++){
                System.out.print("2");
                z = z + 1;
            }
            System.out.println(" Количество символов в строке " + z);
        }
    }
}
