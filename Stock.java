import java.util.*;
class Stock
{
int j;
    String size(String name,int characters)
    {
        int li=name.length();
        if(li>characters)
        {
             name=name.substring(0,characters-2);
            name+="..";
        }
        else
        {
           for(int i=0;i<characters-li;i++)
            {
                name+=" ";
            }
        }
        return name;
    }

    void bill(String p[][],int co,int c)
    {
        int i;
        int cost=0,total=0;
         System.out.println("\n");
               
         System.out.println("\t\t\t***BILL (For The Customer)***");
         System.out.println("_________________________________________________________________________________________________");  

         switch(c)
        {
        case 1:System.out.println(size("Serial Number",25)+size("Seed Name",25)+size("Price(Per Quintal)",25)+size("Quantity Sold",25));
               for(i=1;i<co;i++)
               {

                    total+=cost;
                    System.out.println(size(""+(i),25)+size(p[i][0],25)+size(p[i][1],25)+size(p[i][2],25));
                }
                System.out.println("\t\t\t***Total Amount Payable="+total+"***\n");
                break;
        case 2:System.out.println(size("\n\nSerial Number",25)+size("Fertiliser Name",25)+size("Price(Per kg)",25)+size("Quantity Sold",17));
               for(i=1;i<co;i++)
               {
                    cost=Integer.parseInt(p[i][1])*Integer.parseInt(p[i][2]);
                    total+=cost;
                    System.out.println(size(""+(i),25)+size(p[i][0],25)+size(p[i][1],25)+size(p[i][2],25));
                }
                System.out.println("\t\t\t***Total Amount Payable="+total+"***\n");
                break;
        case 3:System.out.println(size("Serial Number",25)+size("Machine Name",40)+size("Price",25)+size("Quantity Sold",25));
               for(i=1;i<co;i++)
               {
                    cost=Integer.parseInt(p[i][1])*Integer.parseInt(p[i][2]);
                    total+=cost;
                    System.out.println(size(""+(i),15)+size(p[i][0],38)+size(p[i][1],10)+size(p[i][2],17));
                }
                System.out.println("\t\t\t***Total Amount Payable="+total+"***\n");
                break;
        
        }
    }
    
    void show(String p[][],int c,int x)
    {
        switch(x)
        {
        case 1:switch(c)
                {
                 case 1:System.out.println(size("\n\nSerial Number",25)+size("Seed Name",25)+size("Price(Per Quintal)",25)+size("Available",25)+size("Recommended Machine",25));
                   for(j=1;j<p.length;j++)
                   {p[j][1]=""+((Integer.parseInt(p[j][1]))/2);
                        System.out.println(size(""+(j),25)+size(p[j][0],25)+size(p[j][1],25)+size(p[j][2],25)+size(p[j][3],25));
                   }
                   break;
                   case 2:System.out.println(size("\n\nSerial Number",25)+size("Fertiliser Name",25)+size("Price(Per kg)",25)+size("Available",25));
                   for(j=1;j<p.length;j++)
                   {p[j][1]=""+((Integer.parseInt(p[j][1]))/2);
                        System.out.println(size(""+(j),25)+size(p[j][0],25)+size(p[j][1],25)+size(p[j][2],25));
                   }
                   break;
                   case 3:System.out.println(size("\n\nSerial Number",25)+size("Machine Name",40)+size("Price",25)+size("Available",25)+size("Used For",25));
                   for(j=1;j<p.length;j++)
                   {p[j][1]=""+((Integer.parseInt(p[j][1]))/2);
                        System.out.println(size(""+(j),15)+size(p[j][0],38)+size(p[j][1],10)+size(p[j][2],12)+size(p[j][3],24));
                   }
                   break;
                }
                break;
        default:
                switch(c)
                {
                 case 1:System.out.println(size("\n\nSerial Number",25)+size("Seed Name",25)+size("Price(Per Quintal)",25)+size("Available",25)+size("Recommended Machine",25));
                   for(j=1;j<p.length;j++)
                   {
                        System.out.println(size(""+(j),15)+size(p[j][0],15)+size(p[j][1],17)+size(p[j][2],12)+size(p[j][3],20));
                   }
                   break;
                   case 2:System.out.println(size("\n\nSerial Number",25)+size("Fertiliser Name",25)+size("Price(Per kg)",25)+size("Available",25));
                   for(j=1;j<p.length;j++)
                   {
                        System.out.println(size(""+(j),15)+size(p[j][0],15)+size(p[j][1],15)+size(p[j][2],12));
                   }
                   break;
                   case 3:System.out.println(size("\n\nSerial Number",25)+size("Machine Name",40)+size("Price",25)+size("Available",25)+size("Used For",25));
                   for(j=1;j<p.length;j++)
                   {
                        System.out.println(size(""+(j),15)+size(p[j][0],38)+size(p[j][1],10)+size(p[j][2],12)+size(p[j][3],24));
                   }
                   break;
                }
                break;
        
        }
    }

}