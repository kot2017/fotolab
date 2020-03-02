package org.wl.fotolab.model.entity;

import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(FilmyEntity.class)
public abstract class FilmyEntity_ {

	public static volatile SingularAttribute<FilmyEntity, String> nominalAsa;
	public static volatile SingularAttribute<FilmyEntity, Integer> hashCode;
	public static volatile CollectionAttribute<FilmyEntity, WywolaniaEntity> wywolaniasById;
	public static volatile SingularAttribute<FilmyEntity, String> typ;
	public static volatile SingularAttribute<FilmyEntity, Integer> id;
	public static volatile SingularAttribute<FilmyEntity, String> seria;
	public static volatile SingularAttribute<FilmyEntity, String> nazwa;
	public static volatile CollectionAttribute<FilmyEntity, HistoriaEntity> historiasById;
	public static volatile SingularAttribute<FilmyEntity, String> expDate;
	public static volatile SingularAttribute<FilmyEntity, ProducentEntity> producentByProducent;

}

