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
   
}

    
    /**
     * @param args the command line arguments
     */

  
    

