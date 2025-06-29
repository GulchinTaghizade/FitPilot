INSERT INTO fit_user (email, name, password) VALUES
                                                 ('alice@example.com', 'Alice', 'password1'),
                                                 ('bob@example.com', 'Bob', 'password2'),
                                                 ('carol@example.com', 'Carol', 'password3'),
                                                 ('dave@example.com', 'Dave', 'password4'),
                                                 ('eve@example.com', 'Eve', 'password5');

INSERT INTO fitness_goal (goal_type, target_date, user_id) VALUES
                                                               ('Lose Weight', '2025-08-01', 1),
                                                               ('Build Muscle', '2025-09-15', 2),
                                                               ('Run Distance', '2025-07-20', 3),
                                                               ('Increase Flexibility', '2025-10-10', 4),
                                                               ('Gain Endurance', '2025-12-01', 5);

INSERT INTO workout (user_id, workout_type, workout_date) VALUES
                                                              (1, 'Running', '2025-06-01'),
                                                              (2, 'Cycling', '2025-06-02'),
                                                              (3, 'Yoga', '2025-06-03'),
                                                              (4, 'Swimming', '2025-06-04'),
                                                              (5, 'Weight Lifting', '2025-06-05');

INSERT INTO exercise (name, sets, reps, workout_id) VALUES
                                                        ('Push Ups', 3, 15, 1),
                                                        ('Squats', 4, 12, 1),
                                                        ('Plank', 1, 60, 2),
                                                        ('Bicep Curls', 3, 10, 3),
                                                        ('Lunges', 3, 12, 4);