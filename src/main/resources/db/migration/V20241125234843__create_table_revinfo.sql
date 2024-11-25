CREATE TABLE revinfo
(
    rev      int4 NOT NULL,
    revtstmp int8 NULL,
    CONSTRAINT revinfo_pkey PRIMARY KEY (rev)
);

CREATE SEQUENCE revinfo_seq
    INCREMENT BY 50
    START 1
	CACHE 1
	NO CYCLE;