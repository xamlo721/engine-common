package com.xamlo.engine.api.resources;

import java.util.List;

public interface IVertexStructure {

	public IVertexStructure addAttribute(IVertexAttribute attrib);
	
	public void setVertexCount(int count);
	
	public int getVertexStride();
	
	public int getVertexSize();
	
	public int getVertexCount();
	
	public List<IVertexAttribute> getAttributes();
	
	public void clear();
	
}
