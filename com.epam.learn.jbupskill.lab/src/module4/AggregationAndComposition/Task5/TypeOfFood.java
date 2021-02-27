package module4.AggregationAndComposition.Task5;

public enum TypeOfFood {
    NOT_INCLUDET,
    BREAKFAST,
    ALL_INCLUSIVE;

    @Override
    public String toString() {
        return super.toString().replace('_', ' ').toLowerCase();
    }
}