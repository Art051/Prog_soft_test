DROP TABLE IF EXISTS "Student" CASCADE;

DROP TABLE IF EXISTS "Course" CASCADE;

CREATE TABLE IF NOT EXISTS public."Course"
(
    "CourseID" integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    "CourseName" text COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT "Course_pkey" PRIMARY KEY ("CourseID")
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."Course"
    OWNER to postgres;

CREATE TABLE IF NOT EXISTS public."Student"
(
    "StudentID" integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    "StudentName" text COLLATE pg_catalog."default" NOT NULL,
    "Address" text COLLATE pg_catalog."default" NOT NULL,
    "Course" integer NOT NULL,
    CONSTRAINT "Student_pkey" PRIMARY KEY ("StudentID"),
    CONSTRAINT "Course_fkey" FOREIGN KEY ("Course")
        REFERENCES public."Course" ("CourseID") MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."Student"
    OWNER to postgres;
-- Index: fki_Course_fkey

-- DROP INDEX IF EXISTS public."fki_Course_fkey";

CREATE INDEX IF NOT EXISTS "fki_Course_fkey"
    ON public."Student" USING btree
    ("Course" ASC NULLS LAST)
    TABLESPACE pg_default;
