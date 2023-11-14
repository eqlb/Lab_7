public class LifelineSite extends Site{

    public LifelineSite(int _units, double _rate) {
        super(_units,_rate);
    }
    public double getBillableAmount(){
        double base = _units * _rate * 0.5;
        double tax = base * Site.TAX_RATE * 0.2;
        return base + tax;
    }
    @Override
    protected double getBaseAmount(){
        return _units * _rate;
    }
    @Override
    protected double getTaxAmount(){
        return this.getBaseAmount() * Site.TAX_RATE;
    }
}
