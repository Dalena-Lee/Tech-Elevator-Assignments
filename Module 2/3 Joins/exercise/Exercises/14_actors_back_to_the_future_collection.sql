-- 14. The names of actors who've appeared in the movies in the "Back to the Future Collection", sorted alphabetically.
-- (28 rows)
SELECT person_name 
FROM person
JOIN movie_actor ON movie_actor.actor_id = person_id
JOIN movie ON movie.movie_id = movie_actor.movie_id
JOIN collection ON collection.collection_id = movie.collection_id
WHERE collection_name = 'Back to the Future Collection'
GROUP BY person_name
ORDER BY person_name;
