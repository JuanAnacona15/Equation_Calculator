package Model;
public class M_FinancialMatematic {
    public double CalcCM(double JA_i_47, double JA_N_47, double JA_Y_47, double JA_P_47){
        /*In this function we calculate the maximum amount that can be withdrawn periodically.
        Parameters: i, N, Y, P
        Creadto: Juan Manuel Anacona 
        Contact: 3204299106
        Date: 8/08/2023
        */
        double JA_P1_47 =  JA_i_47/JA_N_47;
        double JA_P2_47 = Math.pow(1+(JA_i_47/JA_N_47), JA_N_47*JA_Y_47)-1;
        return JA_P_47 * ((JA_P1_47/JA_P2_47) + JA_P1_47);
    }
    
    public double CalcIM(double JA_i_47, double JA_N_47, double JA_Y_47, double JA_R_47){
        /*In this function we calculate the minimum investment required.
        Parameters: i, N, Y, P
        Creadto: Juan Manuel Anacona 
        Contact: 3204299106
        Date: 8/08/2023
        */
        double JA_P1_47 = (JA_R_47 * JA_N_47)/JA_i_47;
        double JA_P2_47 = 1- (1/Math.pow(1+JA_i_47/JA_N_47, JA_N_47*JA_Y_47));
        return JA_P1_47 * JA_P2_47;
    }
    
    public double CalcVF(double JA_i_47, double JA_N_47, double JA_Y_47, double JA_R_47){
        /*In this function we calculate the future value of an investment.
        Parameters: i, N, Y, P
        Creadto: Juan Manuel Anacona 
        Contact: 3204299106
        Date: 8/08/2023
        */
        double JA_P1_47 = Math.pow(1+JA_i_47/JA_N_47, JA_N_47*JA_Y_47)-1;
        double JA_P2_47 = JA_i_47/JA_N_47;
        return JA_R_47 * (JA_P1_47/JA_P2_47);
    }
    
    public double CalcCN(double JA_i_47, double JA_N_47, double JA_Y_47, double JA_T_47){
        /*In this function we calculate the amount needed as a deposit.
        Parameters: i, N, Y, P
        Creadto: Juan Manuel Anacona 
        Contact: 3204299106
        Date: 8/08/2023
        */
        double JA_P1_47 = Math.pow(1+(JA_i_47/JA_N_47), JA_N_47*JA_Y_47)-1;
        double JA_P2_47 = JA_i_47/JA_N_47;
        return JA_T_47*(JA_P2_47/JA_P1_47);
    }
    
    public double CalcIN(double JA_i_47, double JA_N_47, double JA_Y_47, double JA_T_47){
        /*In this function we calculate the investment needed to have a certain value in the future.
        Parameters: i, N, Y, P
        Creadto: Juan Manuel Anacona 
        Contact: 3204299106
        Date: 8/08/2023
        */
        double JA_P1_47= Math.pow(1+JA_i_47/JA_N_47, JA_N_47*JA_Y_47);
        return JA_T_47/JA_P1_47;
    }
}
