package com.xamlo.engine.api.resources;

public interface IResourceLoader<I> {

    ITextureResource<I> loadTexture(I identifier);

    IShaderResource<I> loadShader(I identifier);
}
