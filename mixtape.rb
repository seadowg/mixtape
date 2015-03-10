require "sinatra"

class Mixtape < Sinatra::Base
  set :public_folder, 'public'

  get "/" do
    songs = Dir.entries("public/songs").reject do |f|
      [".", "..", ".gitkeep", ".DS_Store"].include?(f)
    end

    erb :index, :locals => { :song_count => songs.length }
  end
end
