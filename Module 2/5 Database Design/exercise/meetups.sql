BEGIN TRANSACTION;

DROP TABLE IF EXISTS member_event, event_group, member_group, event, groups, member CASCADE;

CREATE TABLE event (
    event_id serial,
    event_name varchar(200) NOT NULL,
    event_description text NULL,
    event_date timestamp NULL,
    event_duration int NOT NULL,
    groups_id int NULL,
	CONSTRAINT PK_event PRIMARY KEY(event_id)
);

CREATE TABLE member (
    member_id serial,
    member_first_name varchar(200) NOT NULL,
    member_last_name varchar(200) NOT NULL,
    birthday date NULL,
    email_address varchar(200) NULL,
    phone_number text NULL,
    flag int NOT NULL,
	CONSTRAINT PK_member PRIMARY KEY(member_id)
);

CREATE TABLE groups (
    groups_id serial,
    groups_name varchar(200) NOT NULL,
    CONSTRAINT PK_groups PRIMARY KEY(groups_id)
);

CREATE TABLE event_group (
    event_id int NOT NULL,
    groups_id int NOT NULL,
	CONSTRAINT PK_event_group PRIMARY KEY(event_id, groups_id),
    CONSTRAINT FK_event_group_event FOREIGN KEY(event_id) REFERENCES event(event_id),
    CONSTRAINT FK_event_group_groups FOREIGN KEY(groups_id) REFERENCES groups(groups_id)
);

CREATE TABLE member_event (
    event_id int NOT NULL,
    member_id int NOT NULL,
	CONSTRAINT PK_member_event PRIMARY KEY(event_id, member_id),
    CONSTRAINT FK_member_event_event FOREIGN KEY(event_id) REFERENCES event(event_id),
    CONSTRAINT FK_member_event_member FOREIGN KEY(member_id) REFERENCES member(member_id)
);

CREATE TABLE member_group (
    member_id int NOT NULL,
    groups_id int NOT NULL,
	CONSTRAINT PK_member_group PRIMARY KEY(member_id, groups_id),
    CONSTRAINT FK_member_group_member FOREIGN KEY(member_id) REFERENCES member(member_id),
    CONSTRAINT FK_member_group_groups FOREIGN KEY(groups_id) REFERENCES groups(groups_id)
);

INSERT INTO groups (groups_name) VALUES ('London Drawing Group');
INSERT INTO groups (groups_name) VALUES ('Tech Career Fairs');
INSERT INTO groups (groups_name) VALUES ('Tech Elevator Students');
INSERT INTO groups (groups_name) VALUES ('Women Tech Founders');
INSERT INTO groups (groups_name) VALUES ('Georgetown University Wargaming Society');

INSERT INTO event (event_name, event_description, event_date, event_duration, groups_id) VALUES ('Louis Bourgeois: Doodling and the Unconscious', 'This class will explore Louise Bourgeois obsession with Drawing through a series of mindful drawing exercises, working both from imagination, some of Bourgeois’ own writings, and from her oeuvre, expect a series of unusual therapeutic exercises designed to make use of drawing as a cathartic tool.', '2023-01-19 06:30:00 PM', 90, (SELECT groups_id FROM groups WHERE groups_name = 'London Drawing Group'));
INSERT INTO event (event_name, event_description, event_date, event_duration, groups_id) VALUES ('Career Fair: Exclusive Tech Hiring Event-New Tickets Available', 'We will be hosting a Tech Career Fair with our hiring partners from fast growing startups and Fortune 500 companies in technology in the US/Canada.  There will be a focus on helping companies achieve their diversity and inclusivity initiative with more diverse candidates to their talent pool.', '2022-12-16 09:00:00 AM', 180, (SELECT groups_id FROM groups WHERE groups_name = 'Tech Career Fairs'));
INSERT INTO event (event_name, event_description, event_date, event_duration, groups_id) VALUES ('The Women Tech Founders Awards', 'Meet today''s most exciting leaders and organizations as they inspire tomorrow''s women and girls to leverage the power of technology and entrepreneurship.', '2023-03-01 04:30:00 PM', 120, (SELECT groups_id FROM groups WHERE groups_name = 'Women Tech Founders'));
INSERT INTO event (event_name, event_description, event_date, event_duration, groups_id) VALUES ('Gaming Climate Change: Challenges and More Challenges', 'Ed McGrady will discuss climate change gaming for professional use and the associated challenges.', '2023-01-10 06:00:00 PM', 120, (SELECT groups_id FROM groups WHERE groups_name = 'Georgetown University Wargaming Society'));

INSERT INTO member (member_first_name, member_last_name, email_address, phone_number, birthday, flag) VALUES ('Lucy', 'Mcgeown', 'lucy@londondrawinggroup.com', null, null, 1);
INSERT INTO member (member_first_name, member_last_name, email_address, phone_number, birthday, flag) VALUES ('Luisa-Maria', 'MacCormack ', 'luisa@londondrawinggroup.com', null, null, 0);
INSERT INTO member (member_first_name, member_last_name, email_address, phone_number, birthday, flag) VALUES ('Frances', 'Stanfield', 'frances@londondrawinggroup.com', null, null, 1);
INSERT INTO member (member_first_name, member_last_name, email_address, phone_number, birthday, flag) VALUES ('Dalena', 'Nguyen', 'Dalenan330@gmail.com', '(615) 319-9779', '1998-03-30', 1);
INSERT INTO member (member_first_name, member_last_name, email_address, phone_number, birthday, flag) VALUES ('Cayla', 'Weisberg', 'cayla@investherventures.com', null, null, 0);
INSERT INTO member (member_first_name, member_last_name, email_address, phone_number, birthday, flag) VALUES ('Julie', 'Novack', 'contact@partyslate.com', '(312) 596-2105', null, 0);
INSERT INTO member (member_first_name, member_last_name, email_address, phone_number, birthday, flag) VALUES ('Ed','McGrady', 'guws@georgetown.edu', null, null, 0);
INSERT INTO member (member_first_name, member_last_name, email_address, phone_number, birthday, flag) VALUES ('Marley', 'Robinson', 'marleycrobinson99@gmail.com', '(210) 744-0655', '1999-02-22', 1);

INSERT INTO member_group (member_id, groups_id) VALUES ((SELECT member_id FROM member WHERE member_first_name = 'Lucy'), (SELECT groups_id FROM groups WHERE groups_name = 'London Drawing Group'));
INSERT INTO member_group (member_id, groups_id) VALUES ((SELECT member_id FROM member WHERE member_first_name = 'Luisa-Maria'), (SELECT groups_id FROM groups WHERE groups_name = 'London Drawing Group'));
INSERT INTO member_group (member_id, groups_id) VALUES ((SELECT member_id FROM member WHERE member_first_name = 'Frances'), (SELECT groups_id FROM groups WHERE groups_name = 'London Drawing Group'));
INSERT INTO member_group (member_id, groups_id) VALUES ((SELECT member_id FROM member WHERE member_first_name = 'Dalena'), (SELECT groups_id FROM groups WHERE groups_name = 'Tech Elevator Students'));
INSERT INTO member_group (member_id, groups_id) VALUES ((SELECT member_id FROM member WHERE member_first_name = 'Cayla'), (SELECT groups_id FROM groups WHERE groups_name = 'Tech Career Fairs'));
INSERT INTO member_group (member_id, groups_id) VALUES ((SELECT member_id FROM member WHERE member_first_name = 'Julie'), (SELECT groups_id FROM groups WHERE groups_name = 'Women Tech Founders'));
INSERT INTO member_group (member_id, groups_id) VALUES ((SELECT member_id FROM member WHERE member_first_name = 'Ed'), (SELECT groups_id FROM groups WHERE groups_name = 'Georgetown University Wargaming Society'));
INSERT INTO member_group (member_id, groups_id) VALUES ((SELECT member_id FROM member WHERE member_first_name = 'Marley'), (SELECT groups_id FROM groups WHERE groups_name = 'Tech Career Fairs'));

INSERT INTO event_group (event_id, groups_id) VALUES ((SELECT event_id FROM event WHERE event_name = 'Louis Bourgeois: Doodling and the Unconscious'), (SELECT groups_id FROM groups WHERE groups_name = 'London Drawing Group'));
INSERT INTO event_group (event_id, groups_id) VALUES ((SELECT event_id FROM event WHERE event_name = 'Career Fair: Exclusive Tech Hiring Event-New Tickets Available'), (SELECT groups_id FROM groups WHERE groups_name = 'Tech Career Fairs'));
INSERT INTO event_group (event_id, groups_id) VALUES ((SELECT event_id FROM event WHERE event_name = 'The Women Tech Founders Awards'), (SELECT groups_id FROM groups WHERE groups_name = 'Women Tech Founders'));
INSERT INTO event_group (event_id, groups_id) VALUES ((SELECT event_id FROM event WHERE event_name = 'Gaming Climate Change: Challenges and More Challenges'), (SELECT groups_id FROM groups WHERE groups_name = 'Georgetown University Wargaming Society'));

INSERT INTO member_event (member_id, event_id) VALUES ((SELECT member_id FROM member WHERE member_first_name = 'Lucy'), (SELECT event_id FROM event WHERE event_name = 'Louis Bourgeois: Doodling and the Unconscious'));
INSERT INTO member_event (member_id, event_id) VALUES ((SELECT member_id FROM member WHERE member_first_name = 'Luisa-Maria'), (SELECT event_id FROM event WHERE event_name = 'Louis Bourgeois: Doodling and the Unconscious'));
INSERT INTO member_event (member_id, event_id) VALUES ((SELECT member_id FROM member WHERE member_first_name = 'Frances'), (SELECT event_id FROM event WHERE event_name = 'Louis Bourgeois: Doodling and the Unconscious'));
INSERT INTO member_event (member_id, event_id) VALUES ((SELECT member_id FROM member WHERE member_first_name = 'Dalena'), (SELECT event_id FROM event WHERE event_name = 'Career Fair: Exclusive Tech Hiring Event-New Tickets Available'));
INSERT INTO member_event (member_id, event_id) VALUES ((SELECT member_id FROM member WHERE member_first_name = 'Dalena'), (SELECT event_id FROM event WHERE event_name = 'Gaming Climate Change: Challenges and More Challenges'));
INSERT INTO member_event (member_id, event_id) VALUES ((SELECT member_id FROM member WHERE member_first_name = 'Cayla'), (SELECT event_id FROM event WHERE event_name = 'The Women Tech Founders Awards'));
INSERT INTO member_event (member_id, event_id) VALUES ((SELECT member_id FROM member WHERE member_first_name = 'Julie'), (SELECT event_id FROM event WHERE event_name = 'The Women Tech Founders Awards'));
INSERT INTO member_event (member_id, event_id) VALUES ((SELECT member_id FROM member WHERE member_first_name = 'Ed'), (SELECT event_id FROM event WHERE event_name = 'Gaming Climate Change: Challenges and More Challenges'));
INSERT INTO member_event (member_id, event_id) VALUES ((SELECT member_id FROM member WHERE member_first_name = 'Marley'), (SELECT event_id FROM event WHERE event_name = 'Career Fair: Exclusive Tech Hiring Event-New Tickets Available'));
INSERT INTO member_event (member_id, event_id) VALUES ((SELECT member_id FROM member WHERE member_first_name = 'Marley'), (SELECT event_id FROM event WHERE event_name = 'Gaming Climate Change: Challenges and More Challenges'));

COMMIT;
