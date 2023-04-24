public class CentralBank {
    void HousingLoanRate(){
        System.out.println("25%");
    }
    void leasingRate(){
        System.out.println("30% below");
    }
}
class CommercialBank extends CentralBank{
    void leasingRate(){
        System.out.println("25%");
    }
}
class CommercialLeasing extends CommercialBank{
    @Override
    void leasingRate() {
        System.out.println("23%");
    }
}
class CommercialCredit extends CommercialBank{
   void HousingLoanRate(){
       System.out.println("20%");
   }
   void leasingRate(){
       System.out.println("22%");
   }
}
class RateResult{
    public static void main(String[] args) {
        CentralBank c= new CentralBank();
        CentralBank cb= new CommercialBank();
        CentralBank cl= new CommercialLeasing();
        CentralBank cc= new CommercialCredit();
        c.leasingRate();
        cb.leasingRate();
        cl.leasingRate();
        cc.leasingRate();
        CommercialBank cbl,ccl;
        cbl=new CommercialBank();
        ccl=new CommercialCredit();
        cbl.HousingLoanRate();
        ccl.HousingLoanRate();
    }
}
