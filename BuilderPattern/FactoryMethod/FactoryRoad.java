package BuilderPattern.FactoryMethod;

//Step01: interface implementation

interface Route{
    void getRoute();
}

class Road implements Route{
    @Override
    public void getRoute(){
        System.out.println("sending via road");
    }
}

class Air implements Route{
    @Override
    public void getRoute(){
        System.out.println("Sending via AIRRRRR");
    }
}

class RouteFactory{
    public  Route getRouteDetail(String route){
        if(route.equalsIgnoreCase("road")){
            return new Road();
        }else if(route.equalsIgnoreCase("air")){
            return new Air();
        }

        throw new IllegalArgumentException("the route is not defined");
    }
}

public class FactoryRoad {
    public static void main(String[] args){
        RouteFactory route = new RouteFactory();
        Route route1 = route.getRouteDetail("road");
        route1.getRoute();
    }
}
