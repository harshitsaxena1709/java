public class bankfunc{
    static int amt=0;
    public void withdraw(int op1)
    {     if(amt>=op1){
          amt=amt-op1;
    }
        //return op1+op2;
    }
    public void deposit(int op1)
    {   amt=amt+op1;
       // return op1-op2;
    } public int checkbalance ()
    {
        return amt;
    }
}