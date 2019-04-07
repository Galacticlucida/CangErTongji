package cn.lyc.demo.bean;

public class OsData {
    private String OS;
    private int count;

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "OsData{" +
                "OS='" + OS + '\'' +
                ", count=" + count +
                '}';
    }

    public void setCount(int count) {
        this.count = count;
    }
}
