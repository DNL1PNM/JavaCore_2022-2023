package lr4;

public class Example2 {
    public static void main(String[] args) {
        int figure = 9;
        int i;
        int j;
        int z;

        for (i = 0 ; i <= figure ; i++){
            System.out.print("номер строки:" +i+ " ");
            z=0;
            for (j=i;j<figure;j++){
                System.out.print("+");
                z=z+1;
            }
            System.out.println(" Количество символов в строке " + z);
        }
    }
}
