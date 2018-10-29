public class Main{
    public static void main(String[] args){
        calc(8,30,3);
        calc(8,35,3);
        calc(8,40,3);
        calc(9,30,3);
        calc(9,35,3);
        calc(9,40,3);
        calc(10,30,3);
        calc(10,35,3);
        calc(10,40,3);
        calc(11,30,3);
        calc(11,35,3);
        calc(11,40,3);
        calc(8,30,4);
        calc(8,35,4);
        calc(8,40,4);
        calc(8,30,5);
        calc(8,35,5);
        calc(8,40,5);
        calc(8,30,6);
        calc(8,35,6);
        calc(8,40,6);
        }
    public static void calc(int devs, int workweek, int weeks){
        double timereq = 1590;
        double fin = (timereq/devs)/(workweek*weeks)*100;
        System.out.printf("With %d devs working a %d week sprint, for %d hrs/wk, we would be at %.0f%% of capacity.%n",devs,weeks,workweek,fin);
    }
}
/*      Used to find total hours in scenario.(1590)
        int[] hour = {100, 50, 20, 360, 80, 160, 500, 240, 40, 40};
        int tot = 0;
        for(int i = 0; i < hour.length;i++)
        tot += hour[i];
        System.out.println(tot);
*/
