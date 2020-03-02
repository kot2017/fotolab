package org.wl.fotolab.model.entity;

import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ZdarzenieEntity.class)
public abstract class ZdarzenieEntity_ {

	public static volatile SingularAttribute<ZdarzenieEntity, Integer> historia;
	public static volatile SingularAttribute<ZdarzenieEntity, Integer> hashCode;
	public static volatile SingularAttribute<ZdarzenieEntity, Integer> id;
	public static volatile SingularAttribute<ZdarzenieEntity, String> nazwa;
	public static volatile CollectionAttribute<ZdarzenieEntity, HistoriaEntity> historiasById;
	public static volatile SingularAttribute<ZdarzenieEntity, String> opis;

}

