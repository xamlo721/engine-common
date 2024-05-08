package com.xamlo.core.engine.graphics.components.attribs;

import com.xamlo.core.engine.graphics.primitives.EnumDimestionSize;
import com.xamlo.engine.api.resources.IVertexAttribute;

public abstract class AbstractAttribute implements IVertexAttribute  {

	protected final EnumDimestionSize attribSize;	
	protected final EnumAttributeType attribType;

	public AbstractAttribute(EnumDimestionSize attribSize, EnumAttributeType attribType) {
		this.attribSize = attribSize;
		this.attribType = attribType;
	}
	
	@Override
	public EnumDimestionSize getDimensionSize() {
		return attribSize;
	}

	@Override
	public EnumAttributeType getType() {
		return attribType;
	}
	
	@Override
	public int getOffset() {
		return attribSize.value() * attribType.getTypeSize();
	}

}
