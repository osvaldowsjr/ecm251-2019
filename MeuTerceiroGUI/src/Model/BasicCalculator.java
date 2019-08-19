package Model;


public class BasicCalculator {

    private double txtFirst;
    private double txtSecond;
    private double txtResult;

    public double Add(String value1,String value2){
        txtFirst = Double.parseDouble(value1);
        txtSecond = Double.parseDouble(value2);

        txtResult = txtFirst+txtSecond;
        return txtResult;
    }
    public double Subs(String value1,String value2){
        txtFirst = Double.parseDouble(value1);
        txtSecond = Double.parseDouble(value2);

        txtResult = txtFirst-txtSecond;
        return txtResult;
    }
    public double Mult(String value1,String value2){
        txtFirst = Double.parseDouble(value1);
        txtSecond = Double.parseDouble(value2);

        txtResult = txtFirst*txtSecond;
        return txtResult;
    }
    public double Divd(String value1,String value2){
        txtFirst = Double.parseDouble(value1);
        txtSecond = Double.parseDouble(value2);

        txtResult = txtFirst/txtSecond;
        return txtResult;
    }
}
