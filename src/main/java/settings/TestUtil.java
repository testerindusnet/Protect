package settings;

import java.util.ArrayList;

import settings.Xls_Reader;

public class TestUtil {
	
	static Xls_Reader reader;	
	static String excel="Protectcsv.xlsx";
	static String sheetname;

  public static ArrayList<Object[]> getdatafromexcel() {
	  
	  ArrayList<Object[]> data=new ArrayList<Object[]>();
	  try{
		  
		  reader=new Xls_Reader(excel);
	  }
	  catch(Exception e){
		  
		  e.printStackTrace();
		  
	  }
	  
	  sheetname="sheet1";
	  for(int rowNum=2;rowNum<=reader.getRowCount(sheetname);rowNum++)
		  
	  {
		  
		  String binderxl=reader.getCellData(sheetname,"binderxl",rowNum); 
		  String addBinderxl=reader.getCellData(sheetname,"addBinderxl",rowNum);
		  String insuredonexl=reader.getCellData(sheetname,"insuredonexl",rowNum);
		  String datexl=reader.getCellData(sheetname,"datexl",rowNum);
		  String brokerxl=reader.getCellData(sheetname,"brokerxl",rowNum);
		  
		  String PrimeryCedantxl=reader.getCellData(sheetname,"PrimeryCedantxl",rowNum);
		  String umrxl=reader.getCellData(sheetname,"umrxl",rowNum);
		  String clientclaasificxl=reader.getCellData(sheetname,"clientclaasificxl",rowNum);
		  
		  String domicilexl=reader.getCellData(sheetname,"domicilexl",rowNum);
		  String insuredzipxl=reader.getCellData(sheetname,"insuredzipxl",rowNum);
		  String insuredaddlineonexl=reader.getCellData(sheetname,"insuredaddlineonexl",rowNum);
		  String insuredaddlinetwoxl=reader.getCellData(sheetname,"insuredaddlinetwoxl",rowNum);
		  String insuredaddlinethreexl=reader.getCellData(sheetname,"insuredaddlinethreexl",rowNum);
		  String insuredtertryxl=reader.getCellData(sheetname,"insuredtertryxl",rowNum);
		  
		  String redomicile1xl=reader.getCellData(sheetname,"redomicile1xl",rowNum);
		  
		  String reinsuredzipxl=reader.getCellData(sheetname,"reinsuredzipxl",rowNum);
		  
		  String reinsuredaddlineone1xl=reader.getCellData(sheetname,"reinsuredaddlineone1xl",rowNum);
		  
		  String reinsuredaddlinetwo1xl=reader.getCellData(sheetname,"reinsuredaddlinetwo1xl",rowNum);
		  
		  String reinsuredtertry1xl=reader.getCellData(sheetname,"reinsuredtertry1xl",rowNum);
		  
		  String brokeruserxl=reader.getCellData(sheetname,"brokeruserxl",rowNum);
		  
		  String producingbrokerxl=reader.getCellData(sheetname,"producingbrokerxl",rowNum);
		  
		  String producbrokraddressxl=reader.getCellData(sheetname,"producbrokraddressxl",rowNum);
		  
		  String producingbrokercountryxl=reader.getCellData(sheetname,"producingbrokercountryxl",rowNum);
		  
		  String producingbrokerzipxl=reader.getCellData(sheetname,"producingbrokerzipxl",rowNum);
		  
		  String lloydsbrokrnumberxl=reader.getCellData(sheetname,"lloydsbrokrnumberxl",rowNum);
		  
		  String brokerstatexl=reader.getCellData(sheetname,"brokerstatexl",rowNum);
		  
		  String introducerxl=reader.getCellData(sheetname,"introducerxl",rowNum);
		  
		  String introducercommxl=reader.getCellData(sheetname,"introducercommxl",rowNum);
		  
		  String allocatetoxl=reader.getCellData(sheetname,"allocatetoxl",rowNum);
		  
		  String surplusbrokrlicensexl=reader.getCellData(sheetname,"surplusbrokrlicensexl",rowNum);
		  
		  String leaderonexl=reader.getCellData(sheetname,"leaderonexl",rowNum);
		  
		  String leadertwoxl=reader.getCellData(sheetname,"leadertwoxl",rowNum);
		  
		  String interestxl=reader.getCellData(sheetname,"interestxl",rowNum);
		  
		  String methodacceptxl=reader.getCellData(sheetname,"methodacceptxl",rowNum);
		  
		  String tercountryxl=reader.getCellData(sheetname,"tercountryxl",rowNum);
		  
		  String territoryxl=reader.getCellData(sheetname,"territoryxl",rowNum);
		  
		  String limitbasisxl=reader.getCellData(sheetname,"limitbasisxl",rowNum);
		  
		  String threeyearlossratioxl=reader.getCellData(sheetname,"threeyearlossratioxl",rowNum);
		  
		  String cotractbasisxl=reader.getCellData(sheetname,"cotractbasisxl",rowNum);
		  
		  String ustradingxl=reader.getCellData(sheetname,"ustradingxl",rowNum);
		  
		  String fillingstatexl=reader.getCellData(sheetname,"fillingstatexl",rowNum);
		  
		  String usclassificationxl=reader.getCellData(sheetname,"usclassificationxl",rowNum);
		  
		  String cedantnaiccodexl=reader.getCellData(sheetname,"cedantnaiccodexl",rowNum);
		  
		  String limitcurrencyxl=reader.getCellData(sheetname,"limitcurrencyxl",rowNum);
		  
		  String excesscurrencyxl=reader.getCellData(sheetname,"excesscurrencyxl",rowNum);
		  
		  String paymentcurrencyxl=reader.getCellData(sheetname,"paymentcurrencyxl",rowNum);
		  
		  String settlementcurrencyxl=reader.getCellData(sheetname,"settlementcurrencyxl",rowNum);
		  
		  String writtenorderxl=reader.getCellData(sheetname,"writtenorderxl",rowNum);
		  
		  String writtenlinexl=reader.getCellData(sheetname,"writtenlinexl",rowNum);
		  
		  String writtenlineOptionxl=reader.getCellData(sheetname,"writtenlineOptionxl",rowNum);
		  
		  String estimatedsingingxl=reader.getCellData(sheetname,"estimatedsingingxl",rowNum);
		  
		  String signedorderxl=reader.getCellData(sheetname,"signedorderxl",rowNum);
		  
		  String llsignedLinexl=reader.getCellData(sheetname,"llsignedLinexl",rowNum);
		  
		  String signedlineOptionxl=reader.getCellData(sheetname,"signedlineOptionxl",rowNum);
		  
		  String profitcommissionxl=reader.getCellData(sheetname,"profitcommissionxl",rowNum);
		  
		  String date2xl=reader.getCellData(sheetname,"date2xl",rowNum);
		  
		  String policylimitOrgxl=reader.getCellData(sheetname,"policylimitOrgxl",rowNum);
		  
		  String sumInsuredOrgxl=reader.getCellData(sheetname,"sumInsuredOrgxl",rowNum);
		  
		  String shipmentOrgxl=reader.getCellData(sheetname,"shipmentOrgxl",rowNum);
		  
		  String acquisitionOrgxl=reader.getCellData(sheetname,"acquisitionOrgxl",rowNum);
		  
		  String deductibleOrgxl=reader.getCellData(sheetname,"deductibleOrgxl",rowNum);
		  
		  String excessOrgxl=reader.getCellData(sheetname,"excessOrgxl",rowNum);
		  
		  String gpilimtOrgxl=reader.getCellData(sheetname,"gpilimtOrgxl",rowNum);
		  
		  String turnoverOrgxl=reader.getCellData(sheetname,"turnoverOrgxl",rowNum);
		  
		  String permwtyxl=reader.getCellData(sheetname,"permwtyxl",rowNum);
		  
		  
		  String termoftradexl=reader.getCellData(sheetname,"termoftradexl",rowNum);
		  
		  String date3xl=reader.getCellData(sheetname,"date3xl",rowNum);
		  
		  String permfromxl=reader.getCellData(sheetname,"permfromxl",rowNum);
		  
		  String premsrcsplit12xl=reader.getCellData(sheetname,"premsrcsplit12xl",rowNum);
		  
		  String premsrcsplit9xl=reader.getCellData(sheetname,"premsrcsplit9xl",rowNum);
		  
		  String premsrcsplit4xl=reader.getCellData(sheetname,"premsrcsplit4xl",rowNum);
		  
		  String premsrcsplit3xl=reader.getCellData(sheetname,"premsrcsplit3xl",rowNum);
		  String type1xl=reader.getCellData(sheetname,"type1xl",rowNum);
		  String lcxl=reader.getCellData(sheetname,"lcxl",rowNum);
		  
          String limitxl=reader.getCellData(sheetname,"limitxl",rowNum);
		  
		  String excurrxl=reader.getCellData(sheetname,"excurrxl",rowNum);
		  
		  String Hundredxl=reader.getCellData(sheetname,"Hundredxl",rowNum);
		  
		  String suminsuxl=reader.getCellData(sheetname,"suminsuxl",rowNum);
		  String Hunsuminsuxl=reader.getCellData(sheetname,"Hunsuminsuxl",rowNum);
		  String techxl=reader.getCellData(sheetname,"techxl",rowNum);
		  
		  String discxl=reader.getCellData(sheetname,"discxl",rowNum);
		   String paycurrxl=reader.getCellData(sheetname,"paycurrxl",rowNum);
		  String roepcxl=reader.getCellData(sheetname,"roepcxl",rowNum);
		  String settcurrxl=reader.getCellData(sheetname,"settcurrxl",rowNum);
		  
          String roepsxl=reader.getCellData(sheetname,"roepsxl",rowNum);
		  
		  String taxcountryxl=reader.getCellData(sheetname,"taxcountryxl",rowNum);
		  
		  String taxterritoryxl=reader.getCellData(sheetname,"taxterritoryxl",rowNum);
		  
		  String taxtypexl=reader.getCellData(sheetname,"taxtypexl",rowNum);
		  String taxpaybyxl=reader.getCellData(sheetname,"taxpaybyxl",rowNum);
		  String taxadminxl=reader.getCellData(sheetname,"taxadminxl",rowNum);
		//---------------
		  String taxratexl=reader.getCellData(sheetname,"taxratexl",rowNum);
		  String taxamountxl=reader.getCellData(sheetname,"taxamountxl",rowNum);
		  
		  
		  
		  
		  
		  Object ob[]={binderxl,addBinderxl,insuredonexl,datexl,brokerxl,PrimeryCedantxl,umrxl,clientclaasificxl,domicilexl,insuredzipxl,insuredaddlineonexl,insuredaddlinetwoxl,insuredaddlinethreexl,insuredtertryxl,redomicile1xl,reinsuredzipxl,reinsuredaddlineone1xl,reinsuredaddlinetwo1xl,reinsuredtertry1xl,brokeruserxl,producingbrokerxl,producbrokraddressxl,producingbrokercountryxl,producingbrokerzipxl,lloydsbrokrnumberxl,brokerstatexl,introducerxl,introducercommxl,allocatetoxl,surplusbrokrlicensexl,leaderonexl,leadertwoxl,interestxl,methodacceptxl,tercountryxl,territoryxl,limitbasisxl,threeyearlossratioxl,cotractbasisxl,ustradingxl,fillingstatexl,usclassificationxl,cedantnaiccodexl,limitcurrencyxl,excesscurrencyxl,paymentcurrencyxl,settlementcurrencyxl,writtenorderxl,writtenlinexl,writtenlineOptionxl,estimatedsingingxl,signedorderxl,llsignedLinexl,signedlineOptionxl,profitcommissionxl,date2xl,policylimitOrgxl,sumInsuredOrgxl,shipmentOrgxl,acquisitionOrgxl,deductibleOrgxl,excessOrgxl,gpilimtOrgxl,turnoverOrgxl,permwtyxl,termoftradexl,date3xl,permfromxl,premsrcsplit12xl,premsrcsplit9xl,premsrcsplit4xl,premsrcsplit3xl,type1xl,lcxl,limitxl,excurrxl,Hundredxl,suminsuxl,Hunsuminsuxl,techxl,discxl,paycurrxl,roepcxl,settcurrxl,roepsxl,taxcountryxl,taxterritoryxl,taxtypexl,taxpaybyxl,taxadminxl,taxratexl,taxamountxl};
		  
		  data.add(ob);
	  }
	  
	  return data;
	  
  }
  
public static ArrayList<Object[]> getdatafromexcel2() {
	  
	  ArrayList<Object[]> data=new ArrayList<Object[]>();
	  try{
		  
		  reader=new Xls_Reader(excel);
	  }
	  catch(Exception e){
		  
		  e.printStackTrace();
		  
	  }
	  
	  sheetname="Fav";
	  
	  for(int rowNum=2;rowNum<=reader.getRowCount(sheetname);rowNum++)
		  
	  {
		  
		  String currency=reader.getCellData(sheetname,"currency",rowNum); 
		  String broker=reader.getCellData(sheetname,"broker",rowNum);
		  String brokeruser=reader.getCellData(sheetname,"brokeruser",rowNum);
		  String startdt=reader.getCellData(sheetname,"startdt",rowNum);
		  String type=reader.getCellData(sheetname,"type",rowNum);
		  
		  String selection=reader.getCellData(sheetname,"selection",rowNum);
		  String introducer=reader.getCellData(sheetname,"introducer",rowNum);
		  String fname=reader.getCellData(sheetname,"fname",rowNum);
		  
		  String lname=reader.getCellData(sheetname,"lname",rowNum);
		  String mobile=reader.getCellData(sheetname,"mobile",rowNum);
		  String email=reader.getCellData(sheetname,"email",rowNum);
		  String gender=reader.getCellData(sheetname,"gender",rowNum);
		  String country=reader.getCellData(sheetname,"country",rowNum);
		  String postcode=reader.getCellData(sheetname,"postcode",rowNum);
		  
		  String dropdown=reader.getCellData(sheetname,"dropdown",rowNum);
		  
		  String marritals=reader.getCellData(sheetname,"marritals",rowNum);
		  
		  String dob=reader.getCellData(sheetname,"dob",rowNum);
		  
		  String emplstatus=reader.getCellData(sheetname,"emplstatus",rowNum);
		  
		  String Currentinsurer=reader.getCellData(sheetname,"Currentinsurer",rowNum);
		  
		  String Policyexpiry=reader.getCellData(sheetname,"Policyexpiry",rowNum);
		  
		  String Expiringprem=reader.getCellData(sheetname,"Expiringprem",rowNum);
		  
		  String Targetpremium=reader.getCellData(sheetname,"Targetpremium",rowNum);
		  
		  String Targetinsurer=reader.getCellData(sheetname,"Targetinsurer",rowNum);
		  
		  String propertyType=reader.getCellData(sheetname,"propertyType",rowNum);
		  
		  String mainresidence=reader.getCellData(sheetname,"mainresidence",rowNum);
		  
		  String outbuildings=reader.getCellData(sheetname,"outbuildings",rowNum);
		  
		  String purposes=reader.getCellData(sheetname,"purposes",rowNum);
		  
		  String Buildings1=reader.getCellData(sheetname,"Buildings1",rowNum);
		  
		  String transit=reader.getCellData(sheetname,"transit",rowNum);
		  
		  String limit=reader.getCellData(sheetname,"limit",rowNum);
		  
		  String Contenspecified=reader.getCellData(sheetname,"Contenspecified",rowNum);
		  
		  String Description1=reader.getCellData(sheetname,"Description1",rowNum);
		  
		  String amount1=reader.getCellData(sheetname,"amount1",rowNum);
		  
		  String Valuablesunspecified=reader.getCellData(sheetname,"Valuablesunspecified",rowNum);
		  
		  String Description2=reader.getCellData(sheetname,"Description2",rowNum);
		  
		  String amount2=reader.getCellData(sheetname,"amount2",rowNum);
		  
		  String Fineartunspecified=reader.getCellData(sheetname,"Fineartunspecified",rowNum);
		  
		  String locrate=reader.getCellData(sheetname,"locrate",rowNum);
		  
		  String transitrate=reader.getCellData(sheetname,"transitrate",rowNum);
		  
		  String contentrate=reader.getCellData(sheetname,"contentrate",rowNum);
		  
		  String fineartrate=reader.getCellData(sheetname,"fineartrate",rowNum);
		  
		  String valuablesrate=reader.getCellData(sheetname,"valuablesrate",rowNum);
		  
		  String To=reader.getCellData(sheetname,"To",rowNum);
		  String pno=reader.getCellData(sheetname,"pno",rowNum);
		  
		  
		  Object ob[]={currency,broker,brokeruser,startdt,type,selection,introducer,fname,lname,mobile,email,gender,country,postcode,dropdown,marritals,
	        		dob,emplstatus,Currentinsurer,Policyexpiry,Expiringprem,Targetpremium,Targetinsurer,propertyType,
	        		mainresidence,outbuildings,purposes,Buildings1,transit,limit,Contenspecified,Description1,amount1,Valuablesunspecified,
	        		Description2,amount2,Fineartunspecified,locrate,transitrate,contentrate,fineartrate,valuablesrate,To,pno};
		  
		  data.add(ob);
	  }
	  
	  return data;
	  
  }
  
  
public static ArrayList<Object[]> getdatafromexcel3() {
	  
	  ArrayList<Object[]> data=new ArrayList<Object[]>();
	  try{
		  
		  reader=new Xls_Reader(excel);
	  }
	  catch(Exception e){
		  
		  e.printStackTrace();
		  
	  }
	  
	  sheetname="Mta1";
	  
	  for(int rowNum=2;rowNum<=reader.getRowCount(sheetname);rowNum++)
		  
	  {
		  
		  String currency=reader.getCellData(sheetname,"currency",rowNum); 
		  String broker=reader.getCellData(sheetname,"broker",rowNum);
		  String brokeruser=reader.getCellData(sheetname,"brokeruser",rowNum);
		  String startdt=reader.getCellData(sheetname,"startdt",rowNum);
		  String type=reader.getCellData(sheetname,"type",rowNum);
		  
		  String selection=reader.getCellData(sheetname,"selection",rowNum);
		  String introducer=reader.getCellData(sheetname,"introducer",rowNum);
		  String fname=reader.getCellData(sheetname,"fname",rowNum);
		  
		  String lname=reader.getCellData(sheetname,"lname",rowNum);
		  String mobile=reader.getCellData(sheetname,"mobile",rowNum);
		  String email=reader.getCellData(sheetname,"email",rowNum);
		  String gender=reader.getCellData(sheetname,"gender",rowNum);
		  String country=reader.getCellData(sheetname,"country",rowNum);
		  String postcode=reader.getCellData(sheetname,"postcode",rowNum);
		  
		  String dropdown=reader.getCellData(sheetname,"dropdown",rowNum);
		  
		  String marritals=reader.getCellData(sheetname,"marritals",rowNum);
		  
		  String dob=reader.getCellData(sheetname,"dob",rowNum);
		  
		  String emplstatus=reader.getCellData(sheetname,"emplstatus",rowNum);
		  
		  String Currentinsurer=reader.getCellData(sheetname,"Currentinsurer",rowNum);
		  
		  String Policyexpiry=reader.getCellData(sheetname,"Policyexpiry",rowNum);
		  
		  String Expiringprem=reader.getCellData(sheetname,"Expiringprem",rowNum);
		  
		  String Targetpremium=reader.getCellData(sheetname,"Targetpremium",rowNum);
		  
		  String Targetinsurer=reader.getCellData(sheetname,"Targetinsurer",rowNum);
		  
		  String propertyType=reader.getCellData(sheetname,"propertyType",rowNum);
		  
		  String mainresidence=reader.getCellData(sheetname,"mainresidence",rowNum);
		  
		  String outbuildings=reader.getCellData(sheetname,"outbuildings",rowNum);
		  
		  String purposes=reader.getCellData(sheetname,"purposes",rowNum);
		  
		  String Buildings1=reader.getCellData(sheetname,"Buildings1",rowNum);
		  
		  String transit=reader.getCellData(sheetname,"transit",rowNum);
		  
		  String limit=reader.getCellData(sheetname,"limit",rowNum);
		  
		  String Contenspecified=reader.getCellData(sheetname,"Contenspecified",rowNum);
		  
		  String Description1=reader.getCellData(sheetname,"Description1",rowNum);
		  
		  String amount1=reader.getCellData(sheetname,"amount1",rowNum);
		  
		  String Valuablesunspecified=reader.getCellData(sheetname,"Valuablesunspecified",rowNum);
		  
		  String Description2=reader.getCellData(sheetname,"Description2",rowNum);
		  
		  String amount2=reader.getCellData(sheetname,"amount2",rowNum);
		  
		  String Fineartunspecified=reader.getCellData(sheetname,"Fineartunspecified",rowNum);
		  
		  String locrate=reader.getCellData(sheetname,"locrate",rowNum);
		  
		  String transitrate=reader.getCellData(sheetname,"transitrate",rowNum);
		  
		  String contentrate=reader.getCellData(sheetname,"contentrate",rowNum);
		  
		  String fineartrate=reader.getCellData(sheetname,"fineartrate",rowNum);
		  
		  String valuablesrate=reader.getCellData(sheetname,"valuablesrate",rowNum);
		  
		  String To=reader.getCellData(sheetname,"To",rowNum);
		  String pno=reader.getCellData(sheetname,"pno",rowNum);
		  
		  
		  Object ob[]={currency,broker,brokeruser,startdt,type,selection,introducer,fname,lname,mobile,email,gender,country,postcode,dropdown,marritals,
	        		dob,emplstatus,Currentinsurer,Policyexpiry,Expiringprem,Targetpremium,Targetinsurer,propertyType,
	        		mainresidence,outbuildings,purposes,Buildings1,transit,limit,Contenspecified,Description1,amount1,Valuablesunspecified,
	        		Description2,amount2,Fineartunspecified,locrate,transitrate,contentrate,fineartrate,valuablesrate,To,pno};
		  
		  data.add(ob);
	  }
	  
	  return data;
	  
}

public static ArrayList<Object[]> getdatafromexcel4() {
	  
	  ArrayList<Object[]> data=new ArrayList<Object[]>();
	  try{
		  
		  reader=new Xls_Reader(excel);
	  }
	  catch(Exception e){
		  
		  e.printStackTrace();
		  
	  }
	  
	  sheetname="PCNewPolicy";
	  
	  for(int rowNum=2;rowNum<=reader.getRowCount(sheetname);rowNum++)
		  
	  {
		  
		  String currency=reader.getCellData(sheetname,"currency",rowNum); 
		  String broker=reader.getCellData(sheetname,"broker",rowNum);
		  String brokeruser=reader.getCellData(sheetname,"brokeruser",rowNum);
		  String startdt=reader.getCellData(sheetname,"startdt",rowNum);
		  String type=reader.getCellData(sheetname,"type",rowNum);
		  
		  String introducer=reader.getCellData(sheetname,"introducer",rowNum);
		  String title=reader.getCellData(sheetname,"title",rowNum);
		  String fname=reader.getCellData(sheetname,"fname",rowNum);
		  
		  String lname=reader.getCellData(sheetname,"lname",rowNum);
		  String mobile=reader.getCellData(sheetname,"mobile",rowNum);
		  String email=reader.getCellData(sheetname,"email",rowNum);
		  String gender=reader.getCellData(sheetname,"gender",rowNum);
		  String country=reader.getCellData(sheetname,"country",rowNum);
		  String postcode=reader.getCellData(sheetname,"postcode",rowNum);
		  
		  String dropdown=reader.getCellData(sheetname,"dropdown",rowNum);
		  
		  String marritals=reader.getCellData(sheetname,"marritals",rowNum);
		  
		  String dob=reader.getCellData(sheetname,"dob",rowNum);
		  
		  String emplstatus=reader.getCellData(sheetname,"emplstatus",rowNum);
		  
		  String Currentinsurer=reader.getCellData(sheetname,"Currentinsurer",rowNum);
		  
		  String Policyexpiry=reader.getCellData(sheetname,"Policyexpiry",rowNum);
		  
		  String Expiringprem=reader.getCellData(sheetname,"Expiringprem",rowNum);
		  
		  String Targetpremium=reader.getCellData(sheetname,"Targetpremium",rowNum);
		  
		  String Targetinsurer=reader.getCellData(sheetname,"Targetinsurer",rowNum);
		  
		  String propertyType=reader.getCellData(sheetname,"propertyType",rowNum);
		  
		  String mainresidence=reader.getCellData(sheetname,"mainresidence",rowNum);
		  
		  String outbuildings=reader.getCellData(sheetname,"outbuildings",rowNum);
		  
		  String purposes=reader.getCellData(sheetname,"purposes",rowNum);
		  String alarm=reader.getCellData(sheetname,"alarm",rowNum);
		  String Firealarm=reader.getCellData(sheetname,"Firealarm",rowNum);
		  String Buildings1=reader.getCellData(sheetname,"Buildings",rowNum);
		  
		  String transit=reader.getCellData(sheetname,"transit",rowNum);
		  
		  String Tenant=reader.getCellData(sheetname,"Tenant",rowNum);
		  String Contentunspecified=reader.getCellData(sheetname,"Contentunspecified",rowNum);
		  String Contenspecified=reader.getCellData(sheetname,"Contenspecified",rowNum);
		  
		  String Description1=reader.getCellData(sheetname,"Description1",rowNum);
		  
		  String amount1=reader.getCellData(sheetname,"amount1",rowNum);
		  
		  String Valuablesunspecified=reader.getCellData(sheetname,"Valuablesunspecified",rowNum);
		  
		  String Description2=reader.getCellData(sheetname,"Description2",rowNum);
		  
		  String amount2=reader.getCellData(sheetname,"amount2",rowNum);
		  
		  String Fineartunspecified=reader.getCellData(sheetname,"Fineartunspecified",rowNum);
		  
		  String Description6=reader.getCellData(sheetname,"Description6",rowNum);
		  String amount6=reader.getCellData(sheetname,"amount6",rowNum);
		  String introcomm=reader.getCellData(sheetname,"introcomm",rowNum);
		  
		  String brokercomm=reader.getCellData(sheetname,"brokercomm",rowNum);
		  
		 
		  
		  String To=reader.getCellData(sheetname,"To",rowNum);
		  String pno=reader.getCellData(sheetname,"pno",rowNum);
		  
		  
		  Object ob[]={currency,broker,brokeruser,startdt,type,introducer,title,fname,lname,mobile,email,gender,
				  country,postcode,dropdown, marritals,dob,emplstatus,Currentinsurer,Policyexpiry,Expiringprem,
				  Targetpremium,Targetinsurer,propertyType,mainresidence,outbuildings,purposes,alarm,Firealarm,
				  Buildings1,transit,Tenant,Contentunspecified,Contenspecified,Description1,amount1,
				  Valuablesunspecified,Description2,amount2,Fineartunspecified,Description6,amount6,brokercomm,
				  introcomm,To,pno};
		  
		  data.add(ob);
	  }
	  
	  return data;
	  
}

}
