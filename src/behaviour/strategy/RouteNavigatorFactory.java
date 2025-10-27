package behaviour.strategy;

public class RouteNavigatorFactory {

    public static RouteNavigatorStrategy getRouteNavigator(String mode){
        RouteNavigatorStrategy routeNavigatorStrategy = null;
        if(mode.equals("cycle")){
            routeNavigatorStrategy= new CycleRouteNavigator();
        }
        if(mode.equals("bike")){
            routeNavigatorStrategy= new BikeRouteNavigator();
        }
        if(mode.equals("car")){
            routeNavigatorStrategy= new CarRouteNavigator();
        }
        return routeNavigatorStrategy;
    }
}
