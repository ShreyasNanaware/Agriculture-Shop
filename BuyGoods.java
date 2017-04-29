import java.io.*;
class BuyGoods
{
    Stock sell=new Stock();
    String boughtgoods[][]=new String[100][3];
    int it=1;
    long spent;
    long buyGoods(String s[][],int c,long money) throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int n=0;

        sell.show(s,c,1);
        System.out.println("\n"+(s.length)+" Back");
        System.out.print("\nEnter Choice:");
        try
        {
            n=Integer.parseInt(br.readLine());
        }catch(NumberFormatException e)
        {
            System.out.println("\t\t\tINVALID CHOICE\n\n");
            n=0;
        }
        if(n>0 && n<s.length)
        {
            int q=0;
            int avail=Integer.parseInt(s[n][2]);
            while(true)
            {
                System.out.println("\tHow Many "+s[n][0]+" do you want to buy from the Market?");
                try
                {
                    q=Integer.parseInt(br.readLine());
                }catch(NumberFormatException nfe)
                {
                    System.out.println("\t\t\tINVALID QUANTITY\n\n");
                    q=0;
                }
                if((money-((Long.parseLong(s[n][1])/2)*q))>0)
                {
                if(q<0)
                System.out.println("\t\t\tQUANTITY SHOULD BE BETWEEN 1 AND "+avail+"\n\n");
                else if(q==0)
                break;
                else
                {
                    try
                    {
                        avail+=q;
                        s[n][2]=""+avail;
                        boughtgoods[it][0]=s[n][0];
                        boughtgoods[it][1]=""+(Long.parseLong(s[n][1])/2);
                        boughtgoods[it][2]=""+q;
                        
                        spent=(Long.parseLong(boughtgoods[it][1]))*((long)(q));
                        money-=spent;
                        it++;
                    }
                    catch(NumberFormatException nfe)
                    {
                        System.out.println("Error");
                    } 
                    break;
                }
                }
                else
                {
                 System.out.println("\t\t---Not Affordable---");
                }
                System.out.println("\t\t\tINVALID QUANTITY\n\n");
            }
            
        }
        
        else if(n!=s.length)
             System.out.println("\t\t\tSORRY:- INVALID\n\n");
        return money;

    }
}