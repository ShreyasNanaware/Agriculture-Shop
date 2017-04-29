import java.io.*;
class Machines
{
    
    String item[][]={{"0","0","0","0"},{"Mahindra 215 di Yuvraj Tracktor","290000","1000","Tilling and Sowing"},{"Multi-Crop Seed Cum Fertiliser Drill","50000","1000","Fertilising And Sowing"},{"AMBICA Vacuum Destoner","500000","1000","Removing Stones"},{"John Deere 450 Manure Spreader","150000","1000","Spreading Manure"},{"Texpo Drip Irrigation System","70000","1000","Drip Irrigation"},{"John Deere 9410 Combine Harvester","4958500","1000","Harvesting Grain Crops"},{"John Deere Hay Rake","55000","1000","Cut Hay"},{"Honda GX 35 Paddy Harvester","15000","1000","Harvesting Rice"},{"Solon Rice Cutting Machine","200000","1000","Cutting Rice Stalks"},{"Tractor-mounted Forage Cutter","250000","1000","Cutting Crop Stalks"},{"Automatic feeding corn sheller","500000","1000","Removing Corn Chaff"},{"Wheat,Rice,Millets Threasher","5000","1000","Threshing Grains"}};
    SellGoods sell2=new SellGoods();
    BuyGoods buy2=new BuyGoods();
    Stock stok=new Stock();
    
    long menu(long money) throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int n=0;
        System.out.println("\n\t\t___________________________________");
        System.out.println("\t\t***Welcome To Your Machines Shop***");
        System.out.println("\t\t___________________________________");
        System.out.println("___  ___           _     _                 ");
        System.out.println("|  \\/  |          | |   (_)                ");
        System.out.println("| .  . | __ _  ___| |__  _ _ __   ___  ___ ");
        System.out.println("| |\\/| |/ _` |/ __| '_ \\| | '_ \\ / _ \\/ __|");
        System.out.println("| |  | | (_| | (__| | | | | | | |  __/\\__ \\");
        System.out.println("\\_|  |_/\\__,_|\\___|_| |_|_|_| |_|\\___||___/");
        

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
                case 1:money=sell2.sellGoods(item,3,money);
                       break;
                case 2:money=buy2.buyGoods(item,3,money);
                       break;
                case 3:stok.show(item,3,0);
                       break;
                case 4:if(sell2.it>1)
                       {
                            stok.bill(sell2.soldgoods,sell2.it,3);
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