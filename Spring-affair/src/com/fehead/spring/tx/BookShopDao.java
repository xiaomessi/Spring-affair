package com.fehead.spring.tx;

public interface BookShopDao {
	
	//����������ȡ��ĵ���
	public int findBookPriceByIsbn(String isbn);
	
	//������Ŀ�棬ʹ��Ŷ�Ӧ�Ŀ��-1
	public void updateBookStock(String isbn);
	
	//�����û����˻���ʹusername��balance - price
	public void updateUserAccount(String username,int price);
}