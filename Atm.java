class ATM {

    public ATM() {
        
    }
    int arr[] = new int[5];
    public void deposit(int[] banknotesCount) {

        //Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
        // {20,50,100,200,500}
        
        for(int i=0;i<banknotesCount.length;i++) 
        {
            if(banknotesCount[i]>0)
            {
              arr[i]+=banknotesCount[i];
            }
            

        }

    }
    
    public int[] withdraw(int amount) {
    //   PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)->{return b-a;})
 
           ATM atm = new ATM();
        int res[] = new int[5];
       
        int fiveh=((amount/500);
        if(arr[4]>fiveh){
             amount=amount-fiveh*500;
             arr[4]-=fiveh;
             res[4]=fiveh;

         }
          else {
          amount=amount-arr[4]*500;
              res[4]=arr[4];
              arr[4]=0;

        }

        int twoh=((amount/200);
        if(arr[3]>twoh){
             amount=amount-twoh*200;
             arr[3]-=twoh;
             res[3]=twoh;

         }
          else {
          amount=amount-arr[3]*200;
              res[3]=arr[3];
              arr[3]=0;

        }

        int oneh=((amount/100);
        if(arr[2]>oneh){
             amount=amount-oneh*100;
             arr[2]-=oneh;
             res[2]=oneh;

         }
          else {
          amount=amount-arr[2]*100;
              res[2]=arr[2];
              arr[2]=0;

        }

         int fifty=((amount/50);
        if(arr[1]>fifty){
             amount=amount-fifty*50;
             arr[1]-=fifty;
             res[1]=fifty;

         }
          else {
          amount=amount-arr[1]*50;
              res[1]=arr[1];
              arr[1]=0;

        }
        int twenty=((amount/20);
        if(arr[0]>twenty){
             amount=amount-twenty*20;
             arr[0]-=twenty;
             res[0]=twenty;

         }
          else {
          amount=amount-arr[0]*20;
              res[0]=arr[0];
              arr[0]=0;

        }
     int f=0;
     for(int  i=0;i<5;i++)
     {
         if(res[i]!=0) f
         {
             f=1; break;
         }
     }
    if(f==1) return res;
    else return new int[]{-1};

    }
}

/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */
