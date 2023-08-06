package esb;

public class DomesticShippingRouter {

    public String route(Order order) {
        String destinationChannel = null;
        if (order.getAmount() > 175)
            destinationChannel = "nextDayShippingChannel";
        else
            destinationChannel = "defaultShippingChannel";
        return destinationChannel;
    }
}
