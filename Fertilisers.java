import java.io.*;
class Fertilisers
{
    String item[][]={{"0","0","0"},{"UREA","291","1000"},{"A.S","397","1000"},{"DAP","1233","1000"},{"ASP","750","1000"},{"GYPSUM","100","1000"}};
    SellGoods sell2=new SellGoods();
    BuyGoods buy2=new BuyGoods();
    Stock stok=new Stock();
    
    long menu(long money) throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int n=0;
        System.out.println("\n\t\t______________________________________");
        System.out.println("\t\t***Welcome To Your Fertilisers Shop***");
        System.out.println("\t\t______________________________________");
        System.out.println("______        _   _ _ _                   ");
        System.out.println("|  ___|      | | (_) (_)                  ");
        System.out.println("| |_ ___ _ __| |_ _| |_ ___  ___ _ __ ___ ");
        System.out.println("|  _/ _ \\ '__| __| | | / __|/ _ \\ '__/ __|");
        System.out.println("| ||  __/ |  | |_| | | \\__ \\  __/ |  \\__ \\");
        System.out.println("\\_| \\___|_|   \\__|_|_|_|___/\\___|_|  |___/");
        

        do
        {
            System.out.print("\n\n\t***Menu***\n1.Sell Item\n2.Buy Item\n3.Check Stock\n4.Print Bill\n5.Print Money Balance\n6.Back\n7.Exit Program\nEnter Choice:");
            try
            {
                n=Integer.parseInt(br.readLine());
            }catch(NumberFormatException e)
            {
                n=0;
            }
            switch(n)
            {
                case 1:money=sell2.sellGoods(item,2,money);
                       break;
                case 2:money=buy2.buyGoods(item,2,money);
                       break;
                case 3:stok.show(item,2,0);
                       break;
                case 4:if(sell2.it>1)
                       {
                            stok.bill(sell2.soldgoods,sell2.it,2);
                            sell2.it=0;
                        }
                        else
                            System.out.println("\t\t\tPlease SELL Items first\n\n");
                        break;
                case 5:System.out.println("\n\nMoney Balance="+money);
                       break;
                case 6:System.out.println("\t\t\t***Main Menu***\n\n");
                       break;
                case 7:System.exit(0);
                       break;
                default:System.out.println("\t\t\tINVALID Choice\n\n");
            }
        }while(n!=6);
        return money;
    }
}