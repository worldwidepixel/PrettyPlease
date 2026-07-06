package com.lynndova.pretty;

import com.lynndova.pretty.registry.PrettyPleaseCreativeModeTabs;
import net.fabricmc.api.ClientModInitializer;

public class PrettyPleaseClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		PrettyPleaseCreativeModeTabs.init();
	}
}
