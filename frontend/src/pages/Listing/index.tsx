/* eslint-disable no-template-curly-in-string */
import axios from "axios";
import MovieCard from "components/MovieCard";
import Pagination from "components/Pagination";
import { BASE_URL } from "utils/requests";


function Listing(){
    axios.get(`${BASE_URL}/movies`).then(response =>{
        console.log(response.data)
    })
    return(
        <>
        <Pagination/>
        <div className="container"></div>
        <div className="row">
            <div className="col-sm-6 col-lg-4 col-xl-3">
            <MovieCard/>
            </div>
            <div className="col-sm-6 col-lg-4 col-xl-3">
            <MovieCard/>
            </div>
            <div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
            <MovieCard/>
            </div>
            <div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
            <MovieCard/>
            </div>
            <div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
            <MovieCard/>
            </div>
            <div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
            <MovieCard/>
            </div>
            <div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
            <MovieCard/>
            </div>
            <div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
            <MovieCard/>
            </div>
        </div>
        </>
    );
}

export default Listing;