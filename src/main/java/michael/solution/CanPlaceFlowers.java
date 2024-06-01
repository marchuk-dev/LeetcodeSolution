package michael.solution;

class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            int left = i == 0 ? 0 : flowerbed[i - 1];
            int right = i == flowerbed.length - 1 ? 0 : flowerbed[i + 1];
            if (left + right + flowerbed[i] == 0) {
                flowerbed[i] = 1;
                n--;
                if (n <= 0) return true;
            }
        }
        return n <= 0;
    }

}