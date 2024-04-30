package com.xamlo.engine.resources;

import com.xamlo.engine.api.resources.IResourceLoader;

public class ResourceLoader {
	
	private static IResourceLoader<String> resourceLoader;
	
	public static IResourceLoader<String> INSTANCE() {
		return resourceLoader;
	}
	
	public static void setResourceLoader(IResourceLoader<String> loader) {
		resourceLoader = loader;
	}
}
