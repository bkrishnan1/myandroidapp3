package com.example.myandroidapp;

import com.facebook.model.OpenGraphAction;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.BaseAdapter;


public abstract class BaseListElement {
	
	private Drawable icon;
	private String text1;
	private String text2;
	private BaseAdapter adapter;

	
	private int requestCode;
	
	public BaseListElement(Drawable icon, String text1, String text2,
			int requestCode) {
		super();
		this.icon = icon;
		this.text1 = text1;
		this.text2 = text2;
		this.requestCode = requestCode;
		
	}
	

	/**
	 * @return the icon
	 */
	public Drawable getIcon() {
		return icon;
	}
	
	/**
	 * @return the text1
	 */
	public String getText1() {
		return text1;
	}
	/**
	 * @param text1 the text1 to set
	 */
	public void setText1(String text1) {
		this.text1 = text1;
		if (adapter != null) {
		    adapter.notifyDataSetChanged();
		}
	}
	/**
	 * @return the text2
	 */
	public String getText2() {
		return text2;
	}
	/**
	 * @param text2 the text2 to set
	 */
	public void setText2(String text2) {
		this.text2 = text2;
		if (adapter != null) {
		    adapter.notifyDataSetChanged();
		}
	}
	/**
	 * @return the requestCode
	 */
	public int getRequestCode() {
		return requestCode;
	}
	
	/**
	 * @param adapter the adapter to set
	 */
	public void setAdapter(BaseAdapter adapter) {
		this.adapter = adapter;
	}

	protected abstract View.OnClickListener getOnClickListener();
	
	protected void onActivityResult(Intent data) {}

	protected void onSaveInstanceState(Bundle bundle) {}

	protected boolean restoreState(Bundle savedState) {
	    return false;
	}

	protected void notifyDataChanged() {
	    adapter.notifyDataSetChanged();
	}
	
	protected abstract void populateOGAction(OpenGraphAction action);
}
