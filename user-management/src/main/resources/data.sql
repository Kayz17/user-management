REPLACE INTO roles VALUES
(1,'USER'),
(2, 'ADMIN');

REPLACE INTO users (user_id, birthday, email, password, username) VALUES
(1, '1994-01-17', 'admin@gmail.com', 'password', 'kevin');

REPLACE INTO user_role(user_id, role_id) VALUES
(1, 1);