package com.lynndova.pretty;

import net.fabricmc.api.ClientModInitializer;

public class PrettyPleaseClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		PrettyPleaseCreativeModeTabs.init();
	}
}
