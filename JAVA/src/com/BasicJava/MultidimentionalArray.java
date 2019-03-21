package com.BasicJava;

public class MultidimentionalArray {

	public static void main(String[] args) {
		String a[][]=new String [2][2];
		a[0][0]="Manual Testing";
		a[0][1]="Venkat Sir";
		a[1][0]="Selenuim";
		a[1][1]="Srini";
		
			for(int i=0;i<a.length;i++)
			{
			for(int k=0;k<a.length;k++)
			{
			System.out.print(a[i][k]+" ");
			}
			System.out.println();
			}
		}

	}


