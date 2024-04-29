package com.xamlo.engine.device.events;

import net.lenni0451.asmevents.event.IEvent;

public class MouseHoverEvent implements IEvent {

	private final float oldXCoord;
	private final float oldYCoord;
	private final float dx;
	private final float dy;

	public MouseHoverEvent(final float oldXCoord, final float oldYCoord, final float dx, final float dy) {
		this.oldXCoord = oldXCoord;
		this.oldYCoord = oldYCoord;		
		this.dx = dx;
		this.dy = dy;
	}

	public float getDy() {
		return dy;
	}

	public float getDx() {
		return dx;
	}

	public float getOldXCoord() {
		return oldXCoord;
	}

	public float getOldYCoord() {
		return oldYCoord;
	}

}
