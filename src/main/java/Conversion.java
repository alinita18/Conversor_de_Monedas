public class Conversion {
    private String base_code;
    private String target_code;
    private double monto;
    private double conversion_rate;
    private double conversion_result;

    public Conversion(){}

    public String getBase_code() {
        return base_code;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public String getTarget_code() {
        return target_code;
    }

    public void setTarget_code(String target_code) {
        this.target_code = target_code;
    }

    public double getConversion_rate() {
        return conversion_rate;
    }

    public void setConversion_rate(double conversion_rate) {
        this.conversion_rate = conversion_rate;
    }

    public double getConversion_result() {
        return conversion_result;
    }

    public void setConversion_result(double conversion_result) {
        this.conversion_result = conversion_result;
    }

    @Override
    public String toString(){
        return "La conversion de " + monto + " " +  base_code + " a " + target_code + " mediante la tasa actual de cambio de " + conversion_rate
        + " es de " + conversion_result;
    }
}
