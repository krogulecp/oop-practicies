package pl.sages.craft.cleancode.strategy;

public class TaxPolicyGermany implements TaxPolicy{

    @Override
    public double getTax() {
        return 0.21;
    }
}
