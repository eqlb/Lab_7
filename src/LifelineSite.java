public class LifelineSite extends Site{

    public LifelineSite(int units, double rate) {
        super(units,rate);
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
