import java.io.*;
class Agriculture
{
int n;
long donate;
String advice;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
        
    static void main()throws IOException
    {
        long money=100;
        Agriculture obj=new Agriculture();
        money=obj.agrimenu(money);
        System.out.println("\n\nMoney Spent="+(100-money));
        System.out.println("Money Balance="+money);
        
        System.out.println("\t_______________________________________________________________");
        System.out.println("\t                     <<<***Thank You***>>>                     ");
        System.out.println("\t_______________________________________________________________");
        System.out.print('\u000C');
        System.exit(0);
    
    }
    
    long agrimenu(long money)throws IOException
    {
                                                                                                                                           
                                                                                                                                           
        System.out.print('\u000C');
        System.out.print("\n\n\n");
        System.out.println("   SSSSSSSSSSSSSSS hhhhhhh                                                                                                                 ");
        System.out.println(" SS:::::::::::::::Sh:::::h                                                                                                                 ");
        System.out.println("S:::::SSSSSS::::::Sh:::::h                                                                                                                 ");
        System.out.println("S:::::S     SSSSSSSh:::::h                                                                                                                 ");
        System.out.println("S:::::S             h::::h hhhhh       rrrrr   rrrrrrrrr       eeeeeeeeeeee    yyyyyyy           yyyyyyy  aaaaaaaaaaaaa       ssssssssss   ");
        System.out.println("S:::::S             h::::hh:::::hhh    r::::rrr:::::::::r    ee::::::::::::ee   y:::::y         y:::::y   a::::::::::::a    ss::::::::::s  ");
        System.out.println(" S::::SSSS          h::::::::::::::hh  r:::::::::::::::::r  e::::::eeeee:::::ee  y:::::y       y:::::y    aaaaaaaaa:::::a ss:::::::::::::s ");
        System.out.println("  SS::::::SSSSS     h:::::::hhh::::::h rr::::::rrrrr::::::re::::::e     e:::::e   y:::::y     y:::::y              a::::a s::::::ssss:::::s");
        System.out.println("    SSS::::::::SS   h::::::h   h::::::h r:::::r     r:::::re:::::::eeeee::::::e    y:::::y   y:::::y        aaaaaaa:::::a  s:::::s  ssssss ");
        System.out.println("       SSSSSS::::S  h:::::h     h:::::h r:::::r     rrrrrrre:::::::::::::::::e      y:::::y y:::::y       aa::::::::::::a    s::::::s      ");
        System.out.println("            S:::::S h:::::h     h:::::h r:::::r            e::::::eeeeeeeeeee        y:::::y:::::y       a::::aaaa::::::a       s::::::s   ");
        System.out.println("            S:::::S h:::::h     h:::::h r:::::r            e:::::::e                  y:::::::::y       a::::a    a:::::a ssssss   s:::::s ");
        System.out.println("SSSSSSS     S:::::S h:::::h     h:::::h r:::::r            e::::::::e                  y:::::::y        a::::a    a:::::a s:::::ssss::::::s");
        System.out.println("S::::::SSSSSS:::::S h:::::h     h:::::h r:::::r             e::::::::eeeeeeee           y:::::y         a:::::aaaa::::::a s::::::::::::::s ");
        System.out.println("S:::::::::::::::SS  h:::::h     h:::::h r:::::r              ee:::::::::::::e          y:::::y           a::::::::::aa:::a s:::::::::::ss  ");
        System.out.println(" SSSSSSSSSSSSSSS    hhhhhhh     hhhhhhh rrrrrrr                eeeeeeeeeeeeee         y:::::y             aaaaaaaaaa  aaaa  sssssssssss    ");
        System.out.println("                                                                                     y:::::y                                               ");
        System.out.println("                                                                                    y:::::y                                                ");
        System.out.println("                                                                                   y:::::y                                                 ");
        System.out.println("                                                                                  y:::::y                                                  ");
        System.out.println("                                                                                 yyyyyyy                                                   ");
        n=0;
        Seeds seed=new Seeds();
        Fertilisers fertiliser=new Fertilisers();
        Machines machine=new Machines();
        System.out.println("\n\t\t__________________________________________________");
        System.out.println("\t\t***Welcome To Your Agricultural Equipments Shop***  ");
        System.out.println("\t\t__________________________________________________  ");
        
        do
        {
            System.out.print("\n\n\t***Menu***\n1.Seeds Shop\n2.Fertilisers Shop\n3.Machines Shop\n4.Print Money Balance\n5.Donate Money\n6.Exit\nEnter Choice:");
            try
            {
                n=Integer.parseInt(br.readLine());
            }
            catch(NumberFormatException e)
            {
                n=0;
            }
            switch(n)
            {
                case 1:money=seed.menu(money);
                       break;
                case 2:money=fertiliser.menu(money);
                       break;
                case 3:money=machine.menu(money);
                       break;
                case 4:System.out.println("\n\nMoney Balance="+money);
                       break;
                case 5:money=donate(money);
                       break;
                case 6:System.out.println("\t\t\tTHANK YOU,");
                       System.out.println("\t\t\t          WE APPRECIATE YOUR ADVICE");
                       System.out.println("Please Leave An Advice");
                       System.out.println("Your Advice Will be Used For Improving The Shop Facilities");
                       System.out.println("Your Advice:");
                       advice=br.readLine();
                       System.out.println("Advice Given:\n"+advice);
                       break;
                default:System.out.println("\t\t\tINVALID\n\n");
            }
        }while(n!=6);
        return money;
    }
    
    long donate(long money)throws IOException
    {
        long d;
        System.out.print("\nEnter the Amount You Want To Donate:");
        d=Long.parseLong(br.readLine());
        if(money>=d)
        money-=d;
        else
        System.out.println("You have only "+money+" Rupees.");
        return money;
    
    }
    
}