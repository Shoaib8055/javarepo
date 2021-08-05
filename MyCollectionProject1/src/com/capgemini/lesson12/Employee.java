package com.capgemini.lesson12;

public class Employee {
	int eid;
	String ename;
	double salary;
}

class Manager extends Employee
{
	String department;
}

class Director extends Manager
{
	String company;
}