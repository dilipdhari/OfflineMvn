package com.intellect.OfflineMvn.ApiController;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intellect.OfflineMvn.BO.OfflineBO;


@RestController
public class OfflineApiController {

   OfflineBO objOfflineBO = new OfflineBO();
	
	
   @GetMapping("/Welcome")
   public String getTestMessage()
	{
		return objOfflineBO.getTestMessage();
	}
	
   @GetMapping("/Txnpoints")
   public ArrayList getTxnPointList()
	{
		return objOfflineBO.getTxnPointList();
	}
	
}
