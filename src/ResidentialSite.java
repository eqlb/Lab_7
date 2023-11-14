public class ResidentialSite extends Site{


    public ResidentialSite(int _units, double _rate) {
        super(_units,_rate);

    }

    public double getBillableAmount(){
        double base = _units * _rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
    @Override
    protected double getBaseAmount(){
        return _units * _rate * 0.5;
    }
    @Override
    protected double getTaxAmount(){
        return this.getBaseAmount() * Site.TAX_RATE;
    }
}
