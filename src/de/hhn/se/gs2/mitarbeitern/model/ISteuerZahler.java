package de.hhn.se.gs2.mitarbeitern.model;

/**
 * 
 * @author fbertea
 * */
public interface ISteuerZahler {

	public final float grundFreiBetrag = 250.0f;
	
	public float tatsaechlicheEinkommentSteuer();
	public float voraussichtlicheEinkommentSteuer();
}
