CREATE TABLE IF NOT EXISTS Purchase (
  id   NUMBER,
  date TIMESTAMP NOT NULL,
  cost NUMBER    NOT NULL,
  shop VARCHAR   NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS Purchase2 (
  id   NUMBER,
  date TIMESTAMP NOT NULL,
  cost NUMBER    NOT NULL,
  shop VARCHAR   NOT NULL,
  PRIMARY KEY (id)
);