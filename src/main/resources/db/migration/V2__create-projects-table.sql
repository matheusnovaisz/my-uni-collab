CREATE TABLE projects
(
    id          UUID         NOT NULL,
    name        VARCHAR(255) NOT NULL,
    description VARCHAR(255),
    status      VARCHAR(255),
    owner_id    UUID,
    CONSTRAINT pk_projects PRIMARY KEY (id)
);

ALTER TABLE projects
    ADD CONSTRAINT FK_PROJECTS_ON_OWNER FOREIGN KEY (owner_id) REFERENCES "users" (id);