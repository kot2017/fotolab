package org.wl.fotolab.model.entity;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(WynikiEntity.class)
public abstract class WynikiEntity_ {

	public static volatile SingularAttribute<WynikiEntity, WywolaniaEntity> wywolaniaByWywolanie;
	public static volatile SingularAttribute<WynikiEntity, Integer> hashCode;
	public static volatile SingularAttribute<WynikiEntity, String> plik;
	public static volatile SingularAttribute<WynikiEntity, Integer> id;
	public static volatile SingularAttribute<WynikiEntity, String> opis;

}

