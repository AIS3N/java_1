package tp.exo3;

public class Villa extends Building {
    int     roomCounter;
    boolean swimming_pool;

    public Villa(String owner, String address, double area, int roomCounter, boolean swimming_pool) {
        super(owner, address, area);
        this.roomCounter = roomCounter;
        this.swimming_pool = swimming_pool;
    }

    @Override
    double tax() {
        if (swimming_pool)
            return (100 * roomCounter + 750);
        return 100 * roomCounter;
    }

    @Override
    void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Villa{" +
                "Number of rooms=" + roomCounter +
                ", Swimming pool=" + swimming_pool +
                ", Owner='" + owner + '\'' +
                ", Address='" + address + '\'' +
                ", Area=" + area +
                '}';
    }

    public int getRoomCounter() {
        return roomCounter;
    }

    public void setRoomCounter(int roomCounter) {
        this.roomCounter = roomCounter;
    }

    public boolean isSwimming_pool() {
        return swimming_pool;
    }

    public void setSwimming_pool(boolean swimming_pool) {
        this.swimming_pool = swimming_pool;
    }
}
