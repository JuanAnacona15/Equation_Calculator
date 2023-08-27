package Model;
/*In this program we create the functions with which we create the functions to convert
  degrees Celcius, Fahrenheit and Reaumur in other measurements of temperature.
Creadto: Juan Manuel Anacona 
Contact: 3204299106
Date: 8/08/2023
*/
public class M_TemperatureConverter {
    public double Calc_C_F(double JA_C_47){
        /*In this function we convert Celcius to Fahtenheit.
        Parameters: Celcius
        Creadto: Juan Manuel Anacona 
        Contact: 3204299106
        Date: 8/08/2023
        */
        return JA_C_47 * 1.8 +32;
    }
    public double Calc_C_K(double JA_C_47){
        /*In this function we convert Celcius to Kelvin.
        Parameters: Celcius
        Creadto: Juan Manuel Anacona 
        Contact: 3204299106
        Date: 8/08/2023
        */
        return JA_C_47 + 273.15;
    }
    public double Calc_C_Ra(double JA_C_47){
        /*In this function we convert Celcius to Rankine.
        Parameters: Celcius
        Creadto: Juan Manuel Anacona 
        Contact: 3204299106
        Date: 8/08/2023
        */
        return (JA_C_47  * 1.8)+491.67;
    }
    public double Calc_C_Re(double JA_C_47){
        /*In this function we convert Celcius to Reaumur.
        Parameters: Celcius
        Creadto: Juan Manuel Anacona 
        Contact: 3204299106
        Date: 8/08/2023
        */
        return JA_C_47 * 4/5;
    }
    
    
    public double Calc_F_C(double JA_F_47){
        /*In this function we convert Fahrenheit to Celcius.
        Parameters: Fahrenheit
        Creadto: Juan Manuel Anacona 
        Contact: 3204299106
        Date: 8/08/2023
        */
        return (JA_F_47 -32)*0.555555555555555;
    }
    public double Calc_F_K(double JA_F_47){
        /*In this function we convert Fahrenheit to Kelvin.
        Parameters: Fahrenheirt
        Creadto: Juan Manuel Anacona 
        Contact: 3204299106
        Date: 8/08/2023
        */
        return (JA_F_47 + 459.67)*0.5555555555555;
    }
    public double Calc_F_Ra(double JA_F_47){
        /*In this function we convert Fahrenheit to Rankine.
        Parameters: Fahrenheit
        Creadto: Juan Manuel Anacona 
        Contact: 3204299106
        Date: 8/08/2023
        */
        return JA_F_47 + 459.67;
    }
    public double Calc_F_Re(double JA_F_47){
        /*In this function we convert Fahrenheit to Reaumur.
        Parameters: Fahrenheit
        Creadto: Juan Manuel Anacona 
        Contact: 3204299106
        Date: 8/08/2023
        */
        return (JA_F_47 - 32) * 0.44444444444444;
    }
    
    public double Calc_K_C(double JA_K_47){
        /*In this function we convert Kelvin to Celcius.
        Parameters: Kelvin
        Creadto: Juan Manuel Anacona 
        Contact: 3204299106
        Date: 8/08/2023
        */
        return JA_K_47 - 273.15;
    }
    public double Calc_K_F(double JA_K_47){
        /*In this function we convert Kelvin to Fahrenheit.
        Parameters: Kelvin
        Creadto: Juan Manuel Anacona 
        Contact: 3204299106
        Date: 8/08/2023
        */
        return (JA_K_47 * 1.8) - 459.67;
    }
    public double Calc_K_Ra(double JA_K_47){
        /*In this function we convert Kelvin to Rankine.
        Parameters: Kelvin
        Creadto: Juan Manuel Anacona 
        Contact: 3204299106
        Date: 8/08/2023
        */
        return JA_K_47 * 1.8;
    }
    public double Calc_K_Re(double JA_K_47){
        /*In this function we convert Kelvin to Reaumur.
        Parameters: Kelvin
        Creadto: Juan Manuel Anacona 
        Contact: 3204299106
        Date: 8/08/2023
        */
        return (JA_K_47 - 273.15 )* 0.8;
    }
    
}
