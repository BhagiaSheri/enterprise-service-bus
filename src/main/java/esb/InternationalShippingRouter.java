package esb;

public class InternationalShippingRouter {

    public String route(Order order) {
        String destinationChannel = "domesticShippingChannel";

        if (order.getOrderType().equals(OrderType.INTERNATIONAL))
            destinationChannel = "internationalShippingChannel";

        return destinationChannel;
    }
}
