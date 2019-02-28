package com.Day14;

import java.util.Arrays;

public class TestReflection 
{
public static void main(String[] args) throws Exception {
	Class mclass=Class.forName("com.Day14.Mobile");
	Class mbClass = Class.forName("com.Day14.SmartPhone");
	
	getClassObj(mbClass,mbClass);
	getSuperClass(mbClass,mbClass);
	getPublicMemberClasses(mbClass,mbClass);
	getDeclaredClasses(mbClass,mbClass);
	getPackageName(mbClass,mbClass);
	getAllPublicMethods(mbClass,mbClass);
	getAllPublicCons(mbClass,mbClass);
	getAllPublicFields(mbClass,mbClass);
}
private static void getAllPublicFields(Class mbClass, Class smbClass) {
	System.out.println("Invoke Get All Public Fields Method");
	System.out.println(Arrays.toString(mbClass.getFields()));
	System.out.println(Arrays.toString(smbClass.getFields()));
	System.out.println("----------------------------------------");
}
private static void getAllPublicCons(Class mbClass, Class smbClass) {
	System.out.println("Invoke Get All Public Constructor Method");
	System.out.println(Arrays.toString(mbClass.getConstructors()));
	System.out.println(Arrays.toString(smbClass.getConstructors()));
	System.out.println("----------------------------------------");
}

private static void getAllPublicMethods(Class mbClass, Class smbClass) {
	System.out.println("Invoke Get All Public Method");
	System.out.println(Arrays.toString(mbClass.getMethods()));
	System.out.println(Arrays.toString(smbClass.getMethods()));
	System.out.println("----------------------------------------");
}

private static void getPackageName(Class mbClass, Class smbClass) {
	System.out.println("Invoke Get Package Name Method");
	System.out.println(mbClass.getPackage().getName());
	System.out.println(smbClass.getPackage().getName());
	System.out.println("----------------------------------------");
}

private static void getDeclaredClasses(Class mbClass, Class smbClass) {
	System.out.println("Invoke Get Declared Class Method");
	System.out.println(Arrays.toString(mbClass.getDeclaredClasses()));
	System.out.println(Arrays.toString(smbClass.getDeclaredClasses()));
	System.out.println("----------------------------------------");
}

private static void getPublicMemberClasses(Class mbClass, Class smbClass) {
	System.out.println("Invoke Get Public Member Class Method");
	System.out.println(Arrays.toString(mbClass.getClasses()));
	System.out.println(Arrays.toString(smbClass.getClasses()));
	System.out.println("----------------------------------------");
}

private static void getSuperClass(Class mbClass, Class smbClass) {
	System.out.println("Invoke Get Super Class Method");
	System.out.println(mbClass.getSuperclass());
	System.out.println(smbClass.getSuperclass());
	System.out.println("----------------------------------------");
}

private static void getClassObj(Class mbClass, Class smbClass) {
	System.out.println("Invoke Get Class Object Method");
	System.out.println(mbClass);
	System.out.println(smbClass);
	System.out.println("----------------------------------------");	
}
}
