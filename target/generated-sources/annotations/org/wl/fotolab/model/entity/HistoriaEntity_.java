package org.wl.fotolab.model.entity;

import java.sql.Timestamp;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(HistoriaEntity.class)
public abstract class HistoriaEntity_ {

	public static volatile SingularAttribute<HistoriaEntity, ZdarzenieEntity> zdarzenieByZdarzenie;
	public static volatile SingularAttribute<HistoriaEntity, Timestamp> data;
	public static volatile SingularAttribute<HistoriaEntity, ChemikaliaEntity> chemikaliaByChemikalia;
	public static volatile SingularAttribute<HistoriaEntity, Integer> hashCode;
	public static volatile SingularAttribute<HistoriaEntity, ObiektywyEntity> obiektywyByObiektyw;
	public static volatile SingularAttribute<HistoriaEntity, Integer> idHistoria;
	public static volatile SingularAttribute<HistoriaEntity, FilmyEntity> filmyByFilmy;
	public static volatile SingularAttribute<HistoriaEntity, AparatyEntity> aparatyById;
	public static volatile SingularAttribute<HistoriaEntity, Integer> aparat;

}

