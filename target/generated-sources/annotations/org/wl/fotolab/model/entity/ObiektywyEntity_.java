package org.wl.fotolab.model.entity;

import java.sql.Date;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ObiektywyEntity.class)
public abstract class ObiektywyEntity_ {

	public static volatile SingularAttribute<ObiektywyEntity, Date> dataZakupu;
	public static volatile SingularAttribute<ObiektywyEntity, Integer> column10;
	public static volatile SingularAttribute<ObiektywyEntity, String> zrodloZakupu;
	public static volatile SingularAttribute<ObiektywyEntity, Integer> ogniskowa;
	public static volatile SingularAttribute<ObiektywyEntity, Integer> srednica;
	public static volatile SingularAttribute<ObiektywyEntity, String> nazwa;
	public static volatile SingularAttribute<ObiektywyEntity, String> jasnosc;
	public static volatile SingularAttribute<ObiektywyEntity, ProducentEntity> producentByProducent;
	public static volatile SingularAttribute<ObiektywyEntity, String> montowanie;
	public static volatile SingularAttribute<ObiektywyEntity, Integer> hashCode;
	public static volatile CollectionAttribute<ObiektywyEntity, WywolaniaEntity> wywolaniasById;
	public static volatile SingularAttribute<ObiektywyEntity, Integer> id;
	public static volatile CollectionAttribute<ObiektywyEntity, HistoriaEntity> historiasById;

}

