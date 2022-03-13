import {ReactComponent as GitHubIcon} from "../../assets/img/github.svg"
import './styles.css'

function NavBar(){
    return (
    <header>
        <nav className="container">
          <div className="dsmovie-nav-content">
            <h1>Dmovie</h1>
            <a href="https://github.com/kaiquemoreira1">
              <div className="dsmovie-contact-container">
                <GitHubIcon/>
                <p className="dsmovie-contact-text">/DevSuperior</p>
              </div>
            </a>
          </div>
        </nav>
      </header>
   );
}
export default NavBar;