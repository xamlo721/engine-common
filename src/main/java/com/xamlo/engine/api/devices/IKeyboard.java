package com.xamlo.engine.api.devices;

import java.util.Set;

public interface IKeyboard {

	public boolean isKeyPushed(EnumKeyboardButtons key);
	
	public boolean isKeyReleased(EnumKeyboardButtons key);
	
	public boolean isKeyHold(EnumKeyboardButtons key);

	public Set<EnumKeyboardButtons> getPushedKeys();

	public Set<EnumKeyboardButtons> getKeysHolding();

	public Set<EnumKeyboardButtons> getReleasedKeys();
	
}
