package com.xamlo.engine.api.resources;

public interface IModelResource<I> extends IResource<I> {

    /**
     * Получить количество полигонов модели.
     * @return количество полигонов модели
     */
    int getPolygonCount();
    
    /*
     * Возвращает массив данных вершин
     */
    IVertex[] getVertices();
    
    /**
     * Возвращает массив индексов модели
     * @return
     */
    int[] getIndices();

    /**
     * Возвращает структуру вершин, описанных в getVertices
     * @return
     */
	IVertexStructure getStructure();
    
}