package cn.lyc.demo.bean;

public class CityData {
    private String city;
    private int count;

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "CityData{" +
                "city='" + city + '\'' +
                ", count=" + count +
                '}';
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
