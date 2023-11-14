public class LifelineSite extends Site{

    public LifelineSite(int _units, double _rate) {
        super(_units,_rate);
    }
    public double getBillableAmount(){
        double base = _units * _rate * 0.5;
        double tax = base * Site.TAX_RATE * 0.2;
        return base + tax;
    }

    public double getBaseAmount(){
        return _units * _rate;
    }

    public double getTaxAmount(){
        return this.getBaseAmount() * Site.TAX_RATE;
    }
}
