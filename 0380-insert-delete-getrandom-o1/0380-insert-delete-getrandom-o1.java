class RandomizedSet {
    HashSet<Integer> set;
    public RandomizedSet() {
        set = new HashSet<>();
    }
    
    public boolean insert(int val) {
        if(!set.contains(val))
        set.add(val);
        else
            return false;
        return true;
    }
    
    public boolean remove(int val) {
        if(set.contains(val))
        set.remove(val);
        else
            return false;
        return true;
    }
    
    public int getRandom() {
        List<Integer> list = new ArrayList<>(set);
        Random random = new Random();
        int randomIndex = random.nextInt(list.size());

        return list.get(randomIndex);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */