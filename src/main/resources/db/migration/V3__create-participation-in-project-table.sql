CREATE TABLE projects_participants
(
    participants_id           UUID NOT NULL,
    projects_participating_id UUID NOT NULL
);

ALTER TABLE projects_participants
    ADD CONSTRAINT fk_propar_on_project FOREIGN KEY (projects_participating_id) REFERENCES projects (id);

ALTER TABLE projects_participants
    ADD CONSTRAINT fk_propar_on_user FOREIGN KEY (participants_id) REFERENCES users (id);