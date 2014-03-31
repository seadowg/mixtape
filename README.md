# mixtape

> A homemade music compilation (usually on cassette or CD-R) that contains all your favourite tracks.
Often you give such a compilation to the guy or gal of your fancy in hopes that it will help you win their heart.

> **\- Lairor, Urban Dictionary**

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

2. Copy the songs you want into `public/songs`. To dictate order you
need to name the tracks `0.mp3`, `1.mp3` etc (yes just mp3 for the moment).

3. Make sure you have [Ruby](https://www.ruby-lang.org/en/) with [bundler](http://bundler.io/) installed and then bundle
in the project directory:
```bash
$ bundle
```

4. Bring the server up:
```bash
$ bundle exec rackup
```

5. Check that everything is working by visiting [http://localhost:9292](http://localhost:9292).

6. Deploy the app somewhere. Let's use [Heroku](http://heroku.com) for simplicity (you'll need a Heroku account for this):
```bash
$ git add public/songs
$ git commit -m "Added songs :)"
$ heroku create lauras-tape
$ git push heroku master
```
7. Once the deploy is finished navigate to the mixtape! For this demo
the URL would be [http://lauras-tape.herokuapp.com](http://lauras-tape.herokuapp.com).
