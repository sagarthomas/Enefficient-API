package model.util;

import model.adt.ApplianceADT;

public class MergeSort {
	
	private static ApplianceADT[] aux;
	
	private static boolean less(String a, String b) {
		return a.compareTo(b) < 0;
	}
	
	public static void sort(ApplianceADT[] a) {
		aux = new ApplianceADT[a.length];
		sort(a, 0, a.length - 1);
	}
	
	private static void sort(ApplianceADT[] a, int lo, int hi) {
		if(hi <= lo)  return;
		int mid = lo + (hi -lo)/2;
		sort(a, lo, mid);
		sort(a, mid+1, hi);
		merge(a, lo, mid, hi);
	}
	
	private static void merge(ApplianceADT[] a, int lo, int mid, int hi) {
		int i = lo, j = mid + 1;
		
		for(int k = lo; k <= hi; k++) {
			aux[k] = a[k];
		}
		
		for(int k = lo; k <= hi; k++) {
			if(i > mid)       a[k] = aux[j++];
			else if(j > hi)   a[k] = aux[i++];
			else if(less(aux[j].getBRAND_NAME(), aux[i].getBRAND_NAME()))   a[k] = aux[j++];
			else              a[k] = aux[i++];
		}
	}

}
