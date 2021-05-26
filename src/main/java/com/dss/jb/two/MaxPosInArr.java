package com.dss.jb.two;

public class MaxPosInArr {

  public static void main(String[] args) {
    int[][] numArr = { { 3, 9432, 2, 4, 1 }, { 94, 32, 21544, 54 }, { 54, 675, 23, 43 }, { 90, 34, 2312, 56 },
        { 98, 54, 23, 12, 1 }, { 4332, 5, 2, 5, 1 }, { 18, 21, 53, 23, 87 } };

    int maxNum = 0;
    int arrPos = 0;
    int numPos = 0;
    for (int i = 0; i < numArr.length; i++) {
      for (int j = 0; j < numArr[i].length; j++) {
        if (numArr[i][j] > maxNum) {
          maxNum = numArr[i][j];
          arrPos = i;
          numPos = j;

        }
      }
    }
    System.out.println(
        String.format("The max value %d can be found in array number %d, at index %d.", maxNum, arrPos, numPos));
  }
}
