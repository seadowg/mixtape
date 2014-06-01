# mixtape

> A mixtape or mixed-tape is the generic name given to any compilation of songs recorded onto any audio format.
>
> A mixtape, which usually reflects the musical tastes of its compiler, can range from a casually selected list of favorite songs, to a conceptual mix of songs linked by a theme or mood, to a highly personal statement tailored to the tape's intended recipient.

> **\- Wikipedia entry for "Mixtape"**

Mixtapes were cool right? Today you can do Spotify playlists, Soundcloud etc but none of
those really require much work (at least not from the person building the list) and you're
limited to songs you can find on the relevant services.

This app allows you to simply share a mixtape of any tracks you'd like. Also,
it's a little effort. That's good though right?

## Instructions

1. Clone the repo:
```bash
$ git clone git@github.com:seadowg/mixtape.git lauras-tape
```

2. Copy the songs you want into `src/main/resources/public/songs`. To dictate order you
need to name the tracks `0.mp3`, `1.mp3` etc (yes just mp3 for the moment).

3. Make sure you have [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) installed.

4. Bring the server up:
```bash
$ ./gradle run
```

5. Check that everything is working by visiting [http://localhost:9292](http://localhost:4567).

6. Deploy the app somewhere. Let's use [Heroku](http://heroku.com) for simplicity (you'll need a Heroku account for this):
```bash
$ git add .
$ git commit -m "Added songs :)"
$ heroku create lauras-tape
$ git push heroku master
```
7. Once the deploy is finished navigate to the mixtape! For this demo
the URL would be [http://lauras-tape.herokuapp.com](http://lauras-tape.herokuapp.com).
