package org.wl.fotolab.model.entity;

import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(AparatyEntity.class)
public abstract class AparatyEntity_ {

	public static volatile SingularAttribute<AparatyEntity, String> numerInwentarzowy;
	public static volatile SingularAttribute<AparatyEntity, Integer> hashCode;
	public static volatile CollectionAttribute<AparatyEntity, WywolaniaEntity> wywolaniasById;
	public static volatile SingularAttribute<AparatyEntity, String> model;
	public static volatile SingularAttribute<AparatyEntity, String> numerSeryjny;
	public static volatile SingularAttribute<AparatyEntity, Integer> id;
	public static volatile SingularAttribute<AparatyEntity, String> nazwa;
	public static volatile CollectionAttribute<AparatyEntity, HistoriaEntity> historiasById;
	public static volatile SingularAttribute<AparatyEntity, String> opis;
	public static volatile SingularAttribute<AparatyEntity, ProducentEntity> producentByProducent;

}

