package com.treselle;

class RulePipelineStartUp{

public static void main(String[] args) {
	long startTime = System.currentTimeMillis();
	RulePipeline rulePipeline = new RulePipeline();
	rulePipeline. callAllFunction();
	 long stopTime = System.currentTimeMillis();
	  long elapsedTime = stopTime - startTime;
      System.out.println(elapsedTime);
   }
   }