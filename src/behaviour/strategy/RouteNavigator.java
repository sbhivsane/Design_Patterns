package behaviour.strategy;

public class RouteNavigator {

    static void main() {
        // get the route from source to destination via cycle
        String src ="A";
        String des = "B";
        String mode = "cycle";

        RouteNavigatorStrategy routeNavigator = RouteNavigatorFactory.getRouteNavigator(mode);
        routeNavigator.findRoute(src,des);
    }

}
