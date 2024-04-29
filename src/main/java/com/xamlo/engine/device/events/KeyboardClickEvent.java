package com.xamlo.engine.device.events;

import com.xamlo.engine.api.devices.EnumKeyboardButtons;

import net.lenni0451.asmevents.event.IEvent;

public class KeyboardClickEvent implements IEvent {

	private final EnumKeyboardButtons button;
	
	public KeyboardClickEvent(EnumKeyboardButtons button) {
		this.button = button;
	}

	public EnumKeyboardButtons getButton() {
		return button;
	}
}
