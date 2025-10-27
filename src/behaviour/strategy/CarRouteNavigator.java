package behaviour.strategy;

public class CarRouteNavigator implements RouteNavigatorStrategy{
    @Override
    public void findRoute(String src, String des) {
        System.out.println("Route from "+src+" to "+des+" via car");
    }
}
