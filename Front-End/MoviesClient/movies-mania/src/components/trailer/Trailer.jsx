import React from "react";
import { useParams } from "react-router-dom";
import ReactPlayer from "react-player";
import './Trailer.css'

const Trailer = () => {
    let params = useParams();
    let key = params.ytTrailerId;
    const config = {
        youtube: {
            playerVars: { 
                'host': 'http://youtube.com' 
            }
          }
    };

    return (
        <div className="react-player-container">
            {(key!=null) ? <ReactPlayer config={config} controls={true} playing={true} url={`https://youtube.com/watch?v=${key}`} 
            width= "100%" height= "100%"/> : null}
        </div>
    )
}

export default Trailer;