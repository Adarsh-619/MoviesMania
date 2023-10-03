package dev.adarsh.movies.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

/** Sample Record
 * {
 *   "_id": {
 *     "$oid": "651c2e17ccd4599ee0eed666"
 *   },
 *   "imdbId": "tt3915174",
 *   "title": "Puss in Boots: The Last Wish",
 *   "releaseDate": "2022-12-21",
 *   "trailerLink": "https://www.youtube.com/watch?v=tHb7WlgyaUc",
 *   "genres": [
 *     "Animation",
 *     "Action",
 *     "Adventure",
 *     "Comedy",
 *     "Family"
 *   ],
 *   "poster": "https://image.tmdb.org/t/p/w500/1NqwE6LP9IEdOZ57NCT51ftHtWT.jpg",
 *   "backdrops": [
 *     "https://image.tmdb.org/t/p/original/r9PkFnRUIthgBp2JZZzD380MWZy.jpg",
 *     "https://image.tmdb.org/t/p/original/faXT8V80JRhnArTAeYXz0Eutpv9.jpg",
 *     "https://image.tmdb.org/t/p/original/pdrlEaknhta2wvE2dcD8XDEbAI4.jpg",
 *     "https://image.tmdb.org/t/p/original/tGwO4xcBjhXC0p5qlkw37TrH6S6.jpg",
 *     "https://image.tmdb.org/t/p/original/cP8YNG3XUeBmO8Jk7Skzq3vwHy1.jpg",
 *     "https://image.tmdb.org/t/p/original/qLE8yuieTDN93WNJRmFSAEJChOg.jpg",
 *     "https://image.tmdb.org/t/p/original/vNuHqmOJRQXY0PBd887DklSDlBP.jpg",
 *     "https://image.tmdb.org/t/p/original/uUCc62M0I3lpZy0SiydbBmUIpNi.jpg",
 *     "https://image.tmdb.org/t/p/original/2wPJIFrBhzzAP8oHDOlShMkERH6.jpg",
 *     "https://image.tmdb.org/t/p/original/fnfirCEDIkxZnQEtEMMSgllm0KZ.jpg"
 *   ],
 *   "reviewIds": []
 * }
 */

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    private ObjectId objectId;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference
    private List<Review> reviewIds;
}
