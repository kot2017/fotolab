package org.wl.fotolab.model.entity;

import java.sql.Date;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ChemikaliaEntity.class)
public abstract class ChemikaliaEntity_ {

	public static volatile SingularAttribute<ChemikaliaEntity, String> sklad;
	public static volatile SingularAttribute<ChemikaliaEntity, Integer> hashCode;
	public static volatile SingularAttribute<ChemikaliaEntity, String> uwagi;
	public static volatile CollectionAttribute<ChemikaliaEntity, WywolaniaEntity> wywolaniasById;
	public static volatile SingularAttribute<ChemikaliaEntity, Integer> id;
	public static volatile SingularAttribute<ChemikaliaEntity, String> nazwa;
	public static volatile SingularAttribute<ChemikaliaEntity, Date> dataProdukcji;
	public static volatile CollectionAttribute<ChemikaliaEntity, HistoriaEntity> historiasById;
	public static volatile SingularAttribute<ChemikaliaEntity, String> expDate;
	public static volatile SingularAttribute<ChemikaliaEntity, ProducentEntity> producentByProducent;

}

