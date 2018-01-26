/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

/**
 *
 * Autor: Diego Álvarez
 */
public class Array1 {
    public int[] makeMiddle(int[] nums) {
        int[] midArr = new int[2];
	int half = nums.length/2;
	midArr[0] = nums[half-1];
	midArr[1] = nums[half];
	return midArr;
}
   public boolean commonEnd(int[] a, int[] b) {
  return (a[0] == b[0] || a[a.length-1] == b[b.length-1]);
}
   
   public int sum3(int[] nums) {
  return (nums[0] + nums[1] + nums[2]);
}
   
public int[] rotateLeft3(int[] nums) {
  int[] rotated = {nums[1], nums[2], nums[0]};
	return rotated;
}

public int[] reverse3(int[] nums) {
  int[] reverse = {nums[2], nums[1], nums[0]};
	return reverse;
}

public int[] maxEnd3(int[] nums) {
  int[] maxVal = new int[3];
	maxVal[0] = nums[0];
	if(nums[2] >= maxVal[0])
		maxVal[0] = nums[2];
	maxVal[1] = maxVal[0];
	maxVal[2] = maxVal[0];
	return maxVal;
}

public int sum2(int[] nums) {
  if(nums.length >= 2)
		return (nums[0] + nums[1]);
	if(nums.length == 1)
		return nums[0];
	return 0;
}

public int[] middleWay(int[] a, int[] b) {
  int[] middle = {a[1], b[1]};
	return middle;
}

public int[] makeEnds(int[] nums) {
  int[] temp = {nums[0], nums[nums.length-1]};
	return temp;
}

public boolean has23(int[] nums) {
  if(nums[0] == 2 || nums[0] == 3)
	return true;
	return (nums[1] == 2 || nums[1] == 3);
}

public boolean no23(int[] nums) {
  if(nums[0] == 2 || nums[0] == 3)
	return false;
	return !(nums[1] == 2 || nums[1] == 3);
}

public int[] makeLast(int[] nums) {
  int len = nums.length*2;
	int []dubsArr = new int[len];
	dubsArr[len-1] = nums[nums.length-1];
	return dubsArr;
}

public boolean double23(int[] nums) {
  if(nums.length == 2)
	{
		if(nums[0] == 2 && nums[1] == 2)
		return true;
		return (nums[0] == 3 && nums[1] == 3);
	}
	return false;
}

public int[] fix23(int[] nums) {
  int[] fixArr = {nums[0], nums[1], nums[2]};
	if(nums[0] == 2 && nums[1] == 3)
			fixArr[1] = 0;
	if(nums[1] == 2 && nums[2] == 3)
			fixArr[2] = 0;
	return fixArr;
}

public int start1(int[] a, int[] b) {
  int unos = 0;
	if(a.length >= 1 && a[0] == 1)
		unos += 1;
	if(b.length >= 1 && b[0] == 1)
		unos += 1;
	return unos;
}

public int[] biggerTwo(int[] a, int[] b) {
  int sum = a[0]+a[1]-b[0]-b[1];
	if(sum >= 0)
	return a;
	return b;
}

}

    
    /**
     * @param args the command line arguments
     */

  
    

