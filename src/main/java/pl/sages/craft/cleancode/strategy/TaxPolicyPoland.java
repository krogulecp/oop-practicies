package pl.sages.craft.cleancode.strategy;

public class TaxPolicyPoland implements TaxPolicy{

    @Override
    public double getTax() {
        return 0.19;
    }
}
