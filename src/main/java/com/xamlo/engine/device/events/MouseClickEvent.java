package com.xamlo.engine.device.events;

import com.xamlo.engine.api.devices.EnumMouseButtons;

import net.lenni0451.asmevents.event.IEvent;

public class MouseClickEvent implements IEvent {

	private final float xPos;
	private final float yPos;
	private final EnumMouseButtons button;
	
	public MouseClickEvent(final float xPos, final float yPos, final EnumMouseButtons button) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.button = button;
	}

	public EnumMouseButtons getButton() {
		return button;
	}

	public float getyPos() {
		return yPos;
	}

	public float getxPos() {
		return xPos;
	}
	
}
