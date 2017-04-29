import java.io.*;
class Seeds
{
    String item[][]={{"0","0","0","0"},{"Wheat Seeds","1600","1000","Combine Harvester"},{"Rice Seeds","2766","1000","Rice Cutting Machine"},{"Bajra Seeds","1175","1000","Threasher"},{"Barley","1325","1000","Threasher"},{"Maize","1420","1000"," "},{"Areca Nut","12500","1000"," "},{"Cotton","5525","1000"," "},{"Soyabean","3200","1000"," "},{"Mustard","4650","1000"," "},{"Sesamum","4200","1000"," "},{"Groundnut","5970","1000"," "},{"Arhar(Tur)","3850","1000"," "},{"Black Grams(Urd Beans)","4300","1000"," "},{"Green Grams(Moong)","4400","1000"," "},{"Masur Dal","6900","1000"," "}};
    SellGoods sell2=new SellGoods();
    BuyGoods buy2=new BuyGoods();
    Stock stok=new Stock();
    
    long menu(long money) throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int n=0;
        System.out.println("\n\t\t________________________________");
        System.out.println("\t\t***Welcome To Your Seeds Shop***");
        System.out.println("\t\t________________________________");
        System.out.println(" _____               _     ");
        System.out.println("/  ___|             | |    ");
        System.out.println("\\ `--.  ___  ___  __| |___ ");
        System.out.println(" `--. \\/ _ \\/ _ \\/ _` / __|");
        System.out.println("/\\__/ /  __/  __/ (_| \\__ \\");
        System.out.println("\\____/ \\___|\\___|\\__,_|___/");
        

        do
        {
            System.out.print("\n\n\t***Menu***\n1.Sell Item\n2.Buy Item\n3.Check Stock\n4.Print Bill\n5.Print Money Balance\n7.Exit Program\n6.Back\nEnter Choice:");
            try
            {
                n=Integer.parseInt(br.readLine());
            }catch(NumberFormatException e)
            {
                n=0;
            }
            switch(n)
            {
                case 1:money=sell2.sellGoods(item,1,money);
                       break;
                case 2:money=buy2.buyGoods(item,1,money);
                       break;
                case 3:stok.show(item,1,0);
                       break;
                case 4:if(sell2.it>1)
                       {
                            stok.bill(sell2.soldgoods,sell2.it,1);
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