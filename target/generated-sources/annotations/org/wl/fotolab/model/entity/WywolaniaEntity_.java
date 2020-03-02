package org.wl.fotolab.model.entity;

import java.sql.Date;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(WywolaniaEntity.class)
public abstract class WywolaniaEntity_ {

	public static volatile SingularAttribute<WywolaniaEntity, Date> data;
	public static volatile SingularAttribute<WywolaniaEntity, String> rozcienczenie;
	public static volatile SingularAttribute<WywolaniaEntity, String> rezultat;
	public static volatile SingularAttribute<WywolaniaEntity, String> uwagi;
	public static volatile SingularAttribute<WywolaniaEntity, FilmyEntity> filmyByFilmy;
	public static volatile SingularAttribute<WywolaniaEntity, Integer> asa;
	public static volatile CollectionAttribute<WywolaniaEntity, WynikiEntity> wynikisById;
	public static volatile SingularAttribute<WywolaniaEntity, String> katalog;
	public static volatile SingularAttribute<WywolaniaEntity, ChemikaliaEntity> chemikaliaByChemikalia;
	public static volatile SingularAttribute<WywolaniaEntity, String> numerNegatywu;
	public static volatile SingularAttribute<WywolaniaEntity, Integer> hashCode;
	public static volatile SingularAttribute<WywolaniaEntity, AparatyEntity> aparatyByAparaty;
	public static volatile SingularAttribute<WywolaniaEntity, Integer> id;
	public static volatile SingularAttribute<WywolaniaEntity, String> czasWolania;
	public static volatile SingularAttribute<WywolaniaEntity, ObiektywyEntity> obiektywyByObiektywy;

}

