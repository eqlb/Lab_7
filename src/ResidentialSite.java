public class ResidentialSite extends Site{


    public ResidentialSite(int _units, double _rate) {
        super(_units,_rate);

    }

    public double getBillableAmount(){
        double base = _units * _rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
}
