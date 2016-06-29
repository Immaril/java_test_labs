Random random = new Random();

public void Sort(int[] n) {
    while(!inOrder(n)) shuffle(n);
}

public void shuffle(int[] n) {
    for (int i = 0; i < n.length; i++) {
        int swapPosition = random.nextInt(n.length);
        int temp = n[i];
        n[i] = n[swapPosition];
        n[swapPosition] = temp;
    }
}

public boolean inOrder(int[] n) {
    int length = n.length - 1;
    for (int i = 0; i < length; i++) {
        if (n[i] > n[i+1]) return false;
    }
    return true;
}
