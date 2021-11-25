public class PatternPrinting {
    public static void main(String[] args) {
        int first=1,last=20, lineCounter=4;
        for (int i=0;i<4;i++)
        {
            for(int j=0;j<lineCounter;j++)
            {
                System.out.print(first + "*");
                first++;
            }
            for(int j=0 , num = last-lineCounter+1;j<lineCounter;j++,num++)
            {
                System.out.print(num + "*");
                last--;
            }
            lineCounter--;

            System.out.println();
            for(int space = 0;space<=i;space++)
            {
                System.out.print(" ");
            }
        }


    }
}
