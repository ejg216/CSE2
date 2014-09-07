////////////////////////////////////
//Eric Glynn
//09/07/14
//Arithmetic Program

//define the class
public class Arithmetic {
    //define method used
    public static void main(String[] args) { 
        
int nSocks = 3; //declare number of socks
double sockCost$ = 2.58; //sock cost, "$" in variable name
double taxPercent = .06; //tax percantage used to calculate total cost
int nEnvelopes = 1; //declare number of envelopes
double envelopeCost$ = 3.25; //envelope cost, "$" in variable name
int nGlasses = 6; //declare number of drinking glasses
double glassCost$ = 2.29; //glass cost "$" in variable name

double totalSockCost$ = nSocks * sockCost$; //total sock cost before tax
double totalGlassCost$ = nGlasses * glassCost$; //total glass cost before tax
double totalEnvelopeCost$ = nEnvelopes * envelopeCost$; //total enevelope cost before tax

double taxSock$ = totalSockCost$ * taxPercent; //tax for all the socks
double roundedTaxSock$ = taxSock$ * 100; //multiply tax by 100 to get rid of 4 decimal places
int roundedSock$ = (int)roundedTaxSock$; //make this number an integer
double ultimateRoundSock$ = (roundedSock$/100.0); //divide by 100 to get final tax with 2 decimal places

double taxGlass$ = totalGlassCost$ * taxPercent; //tax for all the glasses
double roundedTaxGlass$ = taxGlass$ *100; //multiply tax by 100 to get rid of 4 decimal places
int roundedGlass$ = (int)roundedTaxGlass$; //make this number an integer
double ultimateRoundGlass$ = (roundedGlass$/100.0); //divide by 100 to get final tax with 2 decimal places

double taxEnvelope$ = totalEnvelopeCost$ * taxPercent; //tax for all the envelope
double roundedTaxEnvelope$ = taxEnvelope$ * 100; //multiply tax by 100 to get rid of 4 decimal places
int roundedEnvelope$ = (int)roundedTaxEnvelope$; //make this number an integer
double ultimateRoundEnvelope$ = (roundedEnvelope$/100.0); //divide by 100 to get final tax with 2 decimal places


double totalCostPreTax$ = totalSockCost$ + totalGlassCost$ + totalEnvelopeCost$; //total cost pre tax
double totalTax$ = ultimateRoundEnvelope$ + ultimateRoundGlass$ + ultimateRoundSock$; //total tax
double totalCost$ = totalCostPreTax$ + totalTax$; //final cost of all items including tax

System.out.println("A total of " + nSocks + " socks are being bought at $" + sockCost$  + " each"); //info about socks purchased
System.out.println("The cost of the socks is $" + totalSockCost$); //cost of the socks
System.out.println("The tax amount of the socks is $" + ultimateRoundSock$); //tax of the socks
System.out.println("A total of " + nGlasses + " glasses are being bought at $" + glassCost$ + " each"); //info about glasses purchased
System.out.println("The cost of the glasses is $" + totalGlassCost$); //cost of the glasses
System.out.println("The tax amount of the glasses is $" + ultimateRoundGlass$); //tax of the glasses
System.out.println("A total of " + nEnvelopes + " envelope is being bought at $" + envelopeCost$ + " each"); //info about envelopes purchased
System.out.println("The cost of the envelopes is $" + totalEnvelopeCost$); //cost of the envelopes
System.out.println("The tax amount of the envelopes is $" + ultimateRoundEnvelope$); //tax of the envelopes
System.out.println("The cost of all the items is $" +totalCostPreTax$); //cost of everything
System.out.println("The tax of all the items is $" + totalTax$); //tax of everything
System.out.println("The cost of everything including tax is $" + totalCost$); //total purchase cost


    }//end of method
}//end of class