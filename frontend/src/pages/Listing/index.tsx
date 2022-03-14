/* eslint-disable no-template-curly-in-string */
import axios from "axios";
import MovieCard from "components/MovieCard";
import Pagination from "components/Pagination";
import { useEffect, useState } from "react";
import { MoviePage } from "types/movie";
import { BASE_URL } from "utils/requests";


function Listing(){
    const [pageNumber, setPageNumber] = useState(0);
    const [page, setPage] = useState<MoviePage>({
        content: [],
        last: true,
        totalPages: 0,
        totalElements: 0,
        size: 12,
        number: 0,
        first: true,
        numberOfElements: 0,
        empty: true
    })
    useEffect(() =>{
        axios.get(`${BASE_URL}/movies?size=12&page=${pageNumber}&sort=title`).then(response =>{
            const data = response.data as MoviePage;
            setPage(data);
           
        })
    }, [pageNumber])

    const handlePagleChange = (newPageNumber : number) => {
        setPageNumber(newPageNumber);
    }
    return(
        <>
        <Pagination page = {page} onChange={handlePagleChange}/>
        <div className="container"></div>
        <div className="row">
            {page.content.map(movie =>
            <div key={movie.id} className="col-sm-6 col-lg-4 col-xl-3">
            <MovieCard movie={movie}/>
            </div>)}
        
        </div>
        </>
    );
}

export default Listing;