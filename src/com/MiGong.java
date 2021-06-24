package com;

public class MiGong {
    public static void main(String[] args) {
        int[][] map = new int[8][7];
        for (int i = 0; i < 7; i++){
            map[0][i] = 1;
            map[7][i] = 1;
        }
        for (int i = 0; i < 8; i++){
            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
        map[2][2] = 1;
        for (int i = 0;i < map.length; i++){
            for(int j = 0;j < map[i].length;j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        T a = new T();
        a.findWay(map,1,1);
        System.out.println("============================");
        for (int i = 0;i < map.length; i++){
            for(int j = 0;j < map[i].length;j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class T {
    //0表示走过，1表示障碍，2表示可以走，3表示走过，但是走不通
    //当map[6][5] = 2就表示找到通路，就可以结束，否则就继续找。
    public  boolean findWay(int[][] map , int i, int j){
        if (map[6][5] == 2){
            return true;
        } else {
            if(map[i][j] == 0) {
                map[i][j] = 2;
                //使用找路策略下->右->上->左
                if (findWay(map, i + 1,j)) {//向右走
                    return true;
                } else if (findWay(map, i,j + 1)){//向右走
                    return true;
                } else if(findWay(map, i - 1, j)){//向上走
                    return true;
                } else if (findWay(map, i, j - 1)){//向左走
                    return true;
                }else {
                    map[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }
}
