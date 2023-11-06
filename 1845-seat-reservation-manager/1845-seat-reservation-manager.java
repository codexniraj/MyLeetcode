class SeatManager {
    BitSet bs;

    public SeatManager(int n) {
        this.bs = new BitSet(n);
    }

    public int reserve() {
        int z = bs.nextClearBit(0);
        bs.set(z);
        return ++z;
    }

    public void unreserve(int seatNumber) {
        bs.clear(seatNumber - 1);
    }
}


/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */