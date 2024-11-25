CREATE TABLE person_aud
(
    age         int4 NULL,
    rev         int4 NOT NULL,
    revtype     int2 NULL,
    id          int8 NOT NULL,
    name        varchar(255) NULL,
    CONSTRAINT person_aud_pkey PRIMARY KEY (rev, id),
    CONSTRAINT person_aud_rev_contraint FOREIGN KEY (rev) REFERENCES revinfo(rev)
);
