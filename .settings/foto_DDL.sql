create schema if not exists foto collate utf8_polish_ci;

create table if not exists failed_jobs
(
    id         bigint unsigned auto_increment
        primary key,
    connection text                                not null,
    queue      text                                not null,
    payload    longtext                            not null,
    exception  longtext                            not null,
    failed_at  timestamp default CURRENT_TIMESTAMP not null
)
    collate = utf8mb4_unicode_ci;

create table if not exists migrations
(
    id        int unsigned auto_increment
        primary key,
    migration varchar(255) not null,
    batch     int          not null
)
    collate = utf8mb4_unicode_ci;

create table if not exists producent
(
    ID       int auto_increment
        primary key,
    nazwa    varchar(50)                  null,
    opis     varchar(1000)                null,
    link     varchar(250)                 null,
    etykieta blob                         null,
    fot      varchar(250) default '1.jpg' not null
);

create table if not exists aparaty
(
    ID                 int auto_increment
        primary key,
    nazwa              varchar(50)                  null,
    model              varchar(50)                  null,
    producent          int                          null,
    opis               varchar(50)                  null,
    numer_seryjny      varchar(50)                  null,
    numer_inwentarzowy varchar(50)                  null,
    fot                varchar(250) default '1.jpg' not null,
    constraint FK_aparaty_producent
        foreign key (producent) references producent (ID)
);

create index IXFK_aparaty_producent
    on aparaty (producent);

create table if not exists chemikalia
(
    ID             int auto_increment
        primary key,
    nazwa          varchar(45)                  null,
    data_produkcji date                         null,
    exp_date       varchar(45)                  null,
    sklad          varchar(1000)                null,
    uwagi          varchar(100)                 null,
    producent      int                          not null,
    ulotka         tinyblob                     null,
    etykieta       tinyblob                     null,
    opis           varchar(10000)               null,
    link           varchar(250)                 null,
    fot            varchar(250) default '1.jpg' not null,
    constraint FK_chemikalia_producent
        foreign key (producent) references producent (ID)
)
    collate = utf8_bin;

create index IXFK_chemikalia_producent
    on chemikalia (producent);

create table if not exists filmy
(
    ID          int auto_increment
        primary key,
    typ         varchar(45)                  null,
    nominal_asa varchar(45)                  null,
    exp_date    varchar(45)                  null,
    seria       varchar(45)                  null,
    producent   int                          not null,
    nazwa       varchar(100)                 null,
    etykieta    blob                         null,
    ulotka      tinyblob                     null,
    opis        varchar(10000)               null,
    symbol      varchar(50)                  null,
    link        varchar(250)                 null,
    fot         varchar(250) default '1.jpg' not null,
    katalog     varchar(250) default '/'     not null,
    constraint FK_filmy_producent
        foreign key (producent) references producent (ID)
)
    collate = utf8_bin;

create index IXFK_filmy_producent
    on filmy (producent);

create table if not exists obiektywy
(
    ID            int auto_increment
        primary key,
    nazwa         varchar(100)                 null,
    jasnosc       varchar(10)                  null,
    ogniskowa     int                          null,
    srednica      int                          null,
    data_zakupu   date                         null,
    zrodlo_zakupu varchar(300)                 null,
    producent     int                          null,
    montowanie    varchar(50)                  null,
    column_10     int                          null,
    fot           varchar(250) default '1.jpg' not null,
    constraint FK_obiektywy_producent
        foreign key (producent) references producent (ID)
);

create index IXFK_obiektywy_producent
    on obiektywy (producent);

create table if not exists producent_1
(
    ID    int           null,
    nazwa tinytext      null,
    opis  varchar(1000) null,
    link  tinytext      null
);

create table if not exists users
(
    id                bigint unsigned auto_increment
        primary key,
    name              varchar(255) not null,
    email             varchar(255) not null,
    email_verified_at timestamp    null,
    password          varchar(255) not null,
    remember_token    varchar(100) null,
    created_at        timestamp    null,
    updated_at        timestamp    null,
    constraint users_email_unique
        unique (email)
)
    collate = utf8mb4_unicode_ci;

create table if not exists wywolania
(
    ID             int auto_increment
        primary key,
    data           date         null,
    ASA            int          null,
    rozcienczenie  int          null,
    czas_wolania   varchar(45)  null,
    uwagi          varchar(245) null,
    filmy          int          not null,
    chemikalia     int          not null,
    katalog        varchar(245) null,
    rezultat       varchar(245) null,
    numer_negatywu varchar(200) null,
    obiektywy      int          null,
    aparaty        int          null,
    constraint FK_wywolania_aparaty
        foreign key (aparaty) references aparaty (ID),
    constraint FK_wywolania_chemikalia
        foreign key (chemikalia) references chemikalia (ID),
    constraint FK_wywolania_filmy
        foreign key (filmy) references filmy (ID),
    constraint FK_wywolania_obiektywy
        foreign key (obiektywy) references obiektywy (ID)
)
    collate = utf8_bin;

create table if not exists wyniki
(
    ID        int auto_increment
        primary key,
    plik      varchar(245) null,
    opis      varchar(45)  null,
    wywolanie int          not null,
    constraint FK_wyniki_wywolania
        foreign key (wywolanie) references wywolania (ID)
)
    collate = utf8_bin;

create index IXFK_wyniki_wywolania
    on wyniki (wywolanie);

create index IXFK_wywolania_aparaty
    on wywolania (aparaty);

create index IXFK_wywolania_chemikalia
    on wywolania (chemikalia);

create index IXFK_wywolania_filmy
    on wywolania (filmy);

create index IXFK_wywolania_obiektywy
    on wywolania (obiektywy);

create table if not exists zdarzenie
(
    ID       int auto_increment
        primary key,
    nazwa    varchar(50)   null,
    opis     varchar(1000) null,
    historia int           null
);

create table if not exists historia
(
    ID_historia int auto_increment
        primary key,
    data        datetime null,
    zdarzenie   int      null,
    aparat      int      null,
    obiektyw    int      null,
    chemikalia  int      null,
    filmy       int      null,
    ID          int      null,
    constraint FK_historia_aparaty
        foreign key (ID) references aparaty (ID),
    constraint FK_historia_chemikalia
        foreign key (chemikalia) references chemikalia (ID),
    constraint FK_historia_filmy
        foreign key (filmy) references filmy (ID),
    constraint FK_historia_obiektywy
        foreign key (obiektyw) references obiektywy (ID),
    constraint FK_historia_zdarzenie
        foreign key (zdarzenie) references zdarzenie (ID)
);

create index IXFK_historia_aparaty
    on historia (ID);

create index IXFK_historia_chemikalia
    on historia (chemikalia);

create index IXFK_historia_filmy
    on historia (filmy);

create index IXFK_historia_obiektywy
    on historia (obiektyw);

create index IXFK_historia_zdarzenie
    on historia (zdarzenie);


