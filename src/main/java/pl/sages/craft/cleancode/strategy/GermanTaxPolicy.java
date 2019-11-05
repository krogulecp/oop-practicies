package pl.sages.craft.cleancode.strategy;

/**
 * @author krogulecp
 */
class GermanTaxPolicy implements TaxPolicy {
    @Override
    public double getTax() {
        return 0.21;
    }
}
