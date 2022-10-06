import java.util.*;
class AAA
{
    int ABC=6,EFG=5,HIJ=7,LMN=10;
    public int Seats(String mov,int n)
    {
        if(mov.equals("ABC"))
        {
            if(n<ABC)
            {
                ABC-=n;
                return 1;
            }
            else
            {
                return -1;
            }
        }
        else if(mov.equals("EFG"))
        {
            if(n<EFG)
            {
                EFG=EFG-n;
                return 1;
            }
            else
            {
                return -1;
            }
        }
        else if(mov.equals("HIJ"))
        {
            if(n < HIJ)
            {
                HIJ-=n;
                return 1;
            }
            else
            {
                return -1;
            }
        }
        else if(mov.equals("LMN"))
        {
            if(n<LMN)
            {
                LMN-=n;
                return 1;
            }
            else
            {
                return -1;
            }
        }
        else
        return -1;
    }
} 
class BBB 
{   
    int ABC=9,EFG=5,HIJ=5,LMN=10;
    public int Seats(String mov,int n)
    {
        if(mov.equals("ABC"))
        {
            if(n<ABC)
            {
                ABC-=n;
                return 1;
            }
            else
            {
                return -1;
            }
        }
        else if(mov.equals("EFG"))
        {
            if(n<EFG)
            {
                EFG=EFG-n;
                return 1;
            }
            else
            {
                return -1;
            }
        }
        else if(mov.equals("HIJ"))
        {
            if(n < HIJ)
            {
                HIJ-=n;
                return 1;
            }
            else
            {
                return -1;
            }
        }
        else if(mov.equals("LMN"))
        {
            if(n<LMN)
            {
                LMN-=n;
                return 1;
            }
            else
            {
                return -1;
            }
        }
        else
        return -1;
    }
}
class CCC
{
    int ABC=4,EFG=8,HIJ=6,LMN=9;
    public int Seats(String mov,int n)
    {
        if(mov.equals("ABC"))
        {
            if(n<ABC)
            {
                ABC-=n;
                return 1;
            }
            else
            {
                return -1;
            }
        }
        else if(mov.equals("EFG"))
        {
            if(n<EFG)
            {
                EFG=EFG-n;
                return 1;
            }
            else
            {
                return -1;
            }
        }
        else if(mov.equals("HIJ"))
        {
            if(n < HIJ)
            {
                HIJ-=n;
                return 1;
            }
            else
            {
                return -1;
            }
        }
        else if(mov.equals("LMN"))
        {
            if(n<LMN)
            {
                LMN-=n;
                return 1;
            }
            else
            {
                return -1;
            }
        }
        else
        return -1;
    }
}
class User
{
    int pop,ice,seat,wallet;
    String tht,mov,Name;
    double tot;
    User(int po,int ic,int se,String th,String mo,String Nam,int wal)
    {
        pop=po;ice=ic;tht=th;mov=mo;Name=Nam;wallet=wal;seat=se;
        tot = pop*200 + seat*120 + ice*100 +22.5;
    }
    double bill()
    {
        
        return tot;
    }
    String theatre()
    {return tht;}
    String movie()
    {return mov;}
    String get_name()
    {return Name;}
    int get_wall()
    {return wallet;}
    double Bal()
    {
        if(wallet > tot)
        {return wallet-tot;}
        else
        {
            return 0;
        }
    }
    int ticks ()
    {return seat;}


}

public class BookMyMovie
{
    public static void main(String args[])
    {
        AAA A = new AAA();
        BBB B = new BBB();
        CCC C = new CCC();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        User list []= new User[n];
        int wall= 1900;
        for(int i=0 ; i<n;i++)
        {
            String name = sc.next();
            String mov =sc.next();
            String tht = sc.next();
            int sea = sc.nextInt();
            int pop= sc.nextInt();
            int ice = sc.nextInt();
            list[i]= new User(pop,ice,sea,tht,mov,name,wall);
            wall+=1000;
        }
        for(int i=0 ;i<n;i++)
        {
            if(list[i].theatre().equals("AAA"))
            {
                int ans = A.Seats(list[i].movie(),list[i].ticks());
                if(ans==1)
                {
                    if(list[i].Bal()!=0)
                    {System.out.println(list[i].get_name());
                    System.out.println("Booked");
                    System.out.println(list[i].theatre()+"/"+list[i].movie()+"/"+list[i].bill());
                    System.out.println(list[i].Bal());}
                    else
                    {
                        System.out.println(list[i].get_name());
                        System.out.println("Not Booked");
                        System.out.println("Insufficient Balance");
                        System.out.println(list[i].get_wall());

                    }
                }
                else
                {
                        System.out.println(list[i].get_name());
                        System.out.println("Not Booked");
                        System.out.println("Insufficient Seats");
                        System.out.println(list[i].get_wall());

                }
            }
            if(list[i].theatre().equals("BBB"))
            {
                int ans = B.Seats(list[i].movie(),list[i].ticks());
                if(ans==1)
                {
                    if(list[i].Bal()!=0)
                    {System.out.println(list[i].get_name());
                    System.out.println("Booked");
                    System.out.println(list[i].theatre()+"/"+list[i].movie()+"/"+list[i].bill());
                    System.out.println(list[i].Bal());}
                    else
                    {
                        System.out.println(list[i].get_name());
                        System.out.println("Not Booked");
                        System.out.println("Insufficient Balance");
                        System.out.println(list[i].get_wall());

                    }
                }
                else
                {
                        System.out.println(list[i].get_name());
                        System.out.println("Not Booked");
                        System.out.println("Tickets not Available");
                        System.out.println(list[i].get_wall());

                }
            }
            if(list[i].theatre().equals("CCC"))
            {
                int ans = C.Seats(list[i].movie(),list[i].ticks());
                if(ans==1)
                {
                    if(list[i].Bal()!=0)
                    {System.out.println(list[i].get_name());
                    System.out.println("Booked");
                    System.out.println(list[i].theatre()+"/"+list[i].movie()+"/"+list[i].bill());
                    System.out.println(list[i].Bal());}
                    else
                    {
                        System.out.println(list[i].get_name());
                        System.out.println("Not Booked");
                        System.out.println("Insufficient Balance");
                        System.out.println(list[i].get_wall());

                    }
                }
                else
                {
                        System.out.println(list[i].get_name());
                        System.out.println("Not Booked");
                        System.out.println("Insufficient Seats");
                        System.out.println(list[i].get_wall());

                }
            }

        }
    }

}