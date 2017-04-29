import java.io.*;
class SellGoods
{
    Stock sell=new Stock();
    String soldgoods[][]=new String[100][3];
    int it=1;
    long gain=0;
    long sellGoods(String s[][],int c,long money) throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int n;

            sell.show(s,c,0);
            System.out.println("\n"+(s.length)+" Back");
            System.out.print("\nEnter Choice:");
            try
            {
                n=Integer.parseInt(br.readLine());
            }catch(NumberFormatException e)
            {
                System.out.println("\t\t\tINVALID CHOICE ");
                n=0;
            }
            if(n>0 && n<s.length)
            {
                int q=0;
                int avail=Integer.parseInt(s[n][2]);
                if(avail<=0)
                    System.out.println("\t\t\tSORRY:- NOT AVAILABLE\n\n");
                else
                {
                    while(true)
                    {
                        System.out.println("\tHow Many "+s[n][0]+" do you want to sell to the customer?");
                        try
                        {
                            q=Integer.parseInt(br.readLine());
                        }catch(NumberFormatException nfe)
                        {
                            q=0;
                        }
                        if(q>0 && q<=avail)
                        {
                            try
                            {
                                avail-=q;
                                s[n][2]=""+avail;
                                soldgoods[0][0]=" ";
                                soldgoods[0][1]=" ";
                                soldgoods[0][2]=" ";
                                soldgoods[it][0]=s[n][0];
                                soldgoods[it][1]=s[n][1];
                                soldgoods[it][2]=""+q;
                                
                                gain=(Long.parseLong(soldgoods[it][1]))*q;
                                money+=gain;
                                it++;
                            }
                            catch(NumberFormatException nfe)
                            {
                                System.out.println("Error");
                            }
                            break;
                        }
                        else if(q==0)
                        break;
                        else
                        {
                            System.out.println("\t\t\tQUANTITY SHOULD BE BETWEEN 1 AND "+avail+"\n\n");
                        }
                    }
                    
                }
            }
            
        
            else if(n!=s.length)
                 System.out.println("\t\t\tSORRY:- INVALID\n\n");
            return money;
 
    }
}