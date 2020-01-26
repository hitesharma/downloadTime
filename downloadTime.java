import java.util.Scanner;
public class downloadTime{
    public static void main(String args[]){
        System.out.println("        Download Time Estimator\n   Enter File Size(MB): ");
        Scanner sc=new Scanner(System.in);
        try{double size=sc.nextDouble();
        System.out.println("Choose unit of download speed:\n"+"1)Kilobyte(KB)\n"+
        "2)Megabyte(MB)\n"+"3)GigaByte(GB)\n"+"4)Kibibyte(KiB)\n"+"5)Mebibyte(MiB)\n"+
	"6)Gibibyte(GiB)\n"+"7)Kilobit(Kb)\n"+"8)Megabit(Mb)\n"+"9)Gigabit(Gb)\n");
        String unit=sc.next();
        System.out.println("Enter Speed: ");
        double speed=1,spd=sc.nextDouble();
        if(unit.equals("1")||unit.equals("KB"))
                speed=spd/1000;
        else if(unit.equals("2")||unit.equals("MB"))
                speed=spd;
        else if(unit.equals("3")||unit.equals("GB"))
                speed=spd*1000;
        else if(unit.equals("4")||unit.equals("KiB"))
                speed=spd*0.001024;
        else if(unit.equals("5")||unit.equals("MiB"))
                speed=spd*1.048576;
        else if(unit.equals("6")||unit.equals("GiB"))
                speed=spd*1073.741824;
        else if(unit.equals("7")||unit.equals("Kb"))
                speed=spd*0.000125;
        else if(unit.equals("8")||unit.equals("Mb"))
                speed=spd*0.125;
        else if(unit.equals("9")||unit.equals("Gb"))
                speed=spd*125;
        else{
            System.out.println("Invalid Choice");
            return;}
        double time=size/speed;
        estimate(time);
        }catch(Exception e){
            System.out.println("Invalid Input");
    }}
    public static void estimate(double time){
        if(time>3600){
            double hr=time/3600;
            int hrs=(int)hr;
            double min=(time/60)%60;
            int mins=(int)min;
            double sec=time%60;
            int secs=(int)sec;
            System.out.println("Estimated Time: "+hrs+" hours "+mins+" minutes "+secs+" seconds");
        }else if(time>60){
            double min=time/60;
            int mins=(int)min;
            double sec=time%60;
            int secs=(int)sec;
            System.out.println("Estimated Time: "+mins+" minutes "+secs+" seconds");
        }else{
            int secs=(int)time;
            System.out.println("Estimated Time: "+secs+" seconds");
        }
    }
}