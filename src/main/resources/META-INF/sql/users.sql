DROP TABLE IF EXISTS users;

CREATE TABLE users
(
  user_id serial NOT NULL,
  first_name character varying(50) NOT NULL,
  last_name character varying(50) NOT NULL,
  login character varying(50) NOT NULL,
  password character varying(50) NOT NULL,
  version INT NOT NULL DEFAULT 0,
  CONSTRAINT pk_users PRIMARY KEY (user_id)
);