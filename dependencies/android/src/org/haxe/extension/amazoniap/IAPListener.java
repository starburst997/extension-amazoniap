package org.haxe.extension.amazoniap;

import com.amazon.device.iap.*;
import com.amazon.device.iap.model.*;
import org.json.JSONException;

public class IAPListener implements PurchasingListener {

	public IAPListener() {

	}

	public void onProductDataResponse (ProductDataResponse productDataResponse) {
		if (Extension_iap_amazon._callback==null) {
			return;
		}
		//try {
			Extension_iap_amazon._callback.call1 ("onProductDataResponse", productDataResponse.toString());
		//} catch (JSONException e) {}
	}

	public void onPurchaseResponse (PurchaseResponse purchaseResponse) {
		if (Extension_iap_amazon._callback==null) {
			return;
		}
		//try {
			Extension_iap_amazon._callback.call1("onPurchaseResponse", purchaseResponse.toString());
		//} catch (JSONException e) {}
	}

	public void onPurchaseUpdatesResponse (PurchaseUpdatesResponse purchaseUpdatesResponse) {
		if (Extension_iap_amazon._callback==null) {
			return;
		}
		//try {
			Extension_iap_amazon._callback.call1("onPurchaseUpdatesResponse", purchaseUpdatesResponse.toString());
		//} catch (JSONException e) {}
	}

	public void onUserDataResponse (UserDataResponse userDataResponse) {
		if (Extension_iap_amazon._callback==null) {
			return;
		}
		//try {
			Extension_iap_amazon._callback.call1("onUserDataResponse", userDataResponse.toString());
		//} catch (JSONException e) {}
	}

}
