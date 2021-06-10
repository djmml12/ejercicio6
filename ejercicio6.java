import java.util.*;
public class ejercicio6{
    public static void main(String[] args){
        Random rand= new Random();
        Scanner scanner= new Scanner(System.in);
        int less = 0;
        int higher = 0;
        int sumless = 0;
        int sumhigher = 0;
        final int total = 100;
        int[] ages= new int[100];
        for(int i=0;i<total;i++){
            ages[i]= rand.nextInt(100)+1;
            if(ages[i]<25){
                less++;
                sumless+=ages[i];
                sumless/=2;
            }else{
                higher++;
                sumhigher+=ages[i];
                sumhigher/=2;
            }
            //System.out.println("less: "+less);
            //System.out.println("higher: "+higher);
        }
        System.out.println(" promedio de edad menores de 25 años "+sumless);
        System.out.println(" promedio de edad mayores o igual a 25 años "+sumhigher);

    }
}