package itmo.java.basics.Lab2.Task2;

public class Building {
    public String location;
    public String material;
    public Integer numberOfFloors;
    public Long numberOfInhabitants;

    Building(){
        this.location ="неизвестно";
        this.material="";
        this.numberOfFloors= 0;
        this.numberOfInhabitants=0L;

    }


    Building(String location, String material, Integer numberOfFloors, Long numberOfInhabitants)
    {
        this.location=location;
        this.material=material;
        this.numberOfFloors=numberOfFloors;
        this.numberOfInhabitants=numberOfInhabitants;

    }

    public String toString(){
        return "Building{" +
                "location='"+location+'\''+
                "material='"+material+'\''+
                "number of floors='"+numberOfFloors+'\''+
                "number of inhabitants='"+numberOfInhabitants+'\''+
                '}';
    }

}
