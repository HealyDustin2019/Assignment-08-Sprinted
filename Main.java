public class Main{
    public static void main(String[] args){
        calc(8,3);
        calc(9,3);
        calc(10,3);
        calc(11,3);
        calc(8,4);
        calc(8,5);
        calc(8,6);
        }
    public static void calc(int devs, int weeks){
        double timereq = 1590;
        int workweek = 30;
        double fin = (timereq/devs)/(workweek*weeks)*100;
        System.out.printf("With %d devs working a %d week sprint, for %d hrs/wk, we would be at %.0f%% of capacity.%n",devs,weeks,workweek,fin);
        workweek = 35;
        fin = (timereq/devs)/(workweek*weeks)*100;
        System.out.printf("With %d devs working a %d week sprint, for %d hrs/wk, we would be at %.0f%% of capacity.%n",devs,weeks,workweek,fin);
        workweek = 40;
        fin = (timereq/devs)/(workweek*weeks)*100;
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
