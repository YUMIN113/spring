package com.example.core.practice27;

import java.text.SimpleDateFormat;

public class Log {
	
	public static void printTime() {
		System.out.print("[" + new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss.ms").format(new java.util.Date()) + "] ");
	}

}
