
class it {
    public static boolean isPalindrome(int x) {
        int l = 0;

        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                for (int c = 0; c < 10; c++) {
                    for (int d = 0; d < 10; d++) {
                        for (int e = 0; e < 10; e++) {
                            for (int f = 0; f < 10; f++) {
                                for (int g = 0; g < 10; g++) {
                                    for (int h = 0; h < 10; h++) {
                                        for (int i = 0; i < 10; i++) {
                                            for (int j = 0; j < 10; j++) {
                                                if (x == a * 1000000000 + b * 100000000 + c * 10000000 + d * 1000000
                                                        + e * 100000 + f * 10000 + g * 1000 + h * 100 + i * 10 + j) {
                                                    if ((a == j && b == i && c == h && d == g && e == f)
                                                            || (b == j && c == i && d == h && e == g)
                                                            || (c == j && d == i && e == h && f == g)
                                                            || (d == j && e == i && f == h)
                                                            || (e == j && f == i && g == h) || (f == j && g == i)
                                                            || (g == j && h == i) || (h == j)) {
                                                        l = x;
                                                        System.out.println(true);
                                                    }

                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if(l!=x){
            System.out.println(false);
        }
   
            return l==x;
    }
}

