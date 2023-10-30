public class Cargo {

    public final Dimensions dimensions;
    public final double weight;
    public final String deliveryAddress;
    public final boolean isTurnOver;
    public final String registrationNumber;
    public final boolean isFragile;

    public Cargo(Dimensions dimensions, double weight, String deliveryAddress,
                 boolean isTurnOver, String registrationNumber,
                 boolean isFragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress =deliveryAddress;
        this.isTurnOver = isTurnOver;
        this.registrationNumber = registrationNumber;
        this.isFragile = isFragile;
    }
    public Cargo setNewDimensions (Dimensions dimensions) {
        return new Cargo(dimensions, weight, deliveryAddress,
        isTurnOver, registrationNumber,
        isFragile);
    }
    public Cargo setNewWeight (double weight) {
        return new Cargo(dimensions, weight, deliveryAddress,
                isTurnOver, registrationNumber,
                isFragile);
    }
    public Cargo setNewDeliveryAddress (String deliveryAddress) {
        return new Cargo(dimensions, weight, deliveryAddress,
                isTurnOver, registrationNumber,
                isFragile);
    }
    public Cargo setNewIsTurnOver (boolean isTurnOver) {
        return new Cargo(dimensions, weight, deliveryAddress,
                isTurnOver, registrationNumber,
                isFragile);
    }
    public Cargo setNewRegistrationNumber (String registrationNumber) {
        return new Cargo(dimensions, weight, deliveryAddress,
                isTurnOver, registrationNumber,
                isFragile);
    }
    public Cargo setNewIsFragile (boolean isFragile) {
        return new Cargo(dimensions, weight, deliveryAddress,
                isTurnOver, registrationNumber,
                isFragile);
    }
    public Dimensions getDimensions() {
        return dimensions;
    }
    public double getWeight() {
        return weight;
    }
    public String getDeliveryAddress() {
        return deliveryAddress;
    }
    public boolean getIsTurnOver() {
        return isTurnOver;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public boolean getIsFragile() {
        return isFragile;
    }

    public String toString() {
        return "габариты: " + dimensions.getCargoVolume() + "\n" +
                "масса: " + weight + "\n" +
                "адрес доставки: " + deliveryAddress + "\n" +
                "можно ли переворачивать: " + isTurnOver + "\n" +
                "регистрационный номер: " + registrationNumber + "\n" +
                "является ли груз хрупким: " + isFragile + "\n";
    }
}
