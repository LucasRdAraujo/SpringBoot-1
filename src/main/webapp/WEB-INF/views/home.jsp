<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0"
        crossorigin="anonymous">
    <script src="https://kit.fontawesome.com/26cf4bd766.js" crossorigin="anonymous"></script>
    <%-- <script src="assets/scripts/index.js"></script> --%>
    <link rel="stylesheet" href="assets/css/styles.css" />
    <title>PokeCards - Home</title>
</head>

<body>
    <nav id="navigation" class="navbar navbar-expand-lg navbar-light">
        <div class="container-fluid">
            <a class="navbar-brand d-block d-sm-block d-lg-none" href="#">
                <img class="nav-logo" src="assets/imgs/navlogo.svg" alt="Logo PokeCards">
            </a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link" href="#">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Cardbox</a>
                    </li>
                </ul>
                <ul class="navbar-nav d-none d-lg-block me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a href="#">
                            <img class="nav-logo" src="assets/imgs/navlogo.svg" alt="Logo PokeCards"/>
                        </a>
                    </li>
                </ul>
                <ul class="navbar-nav mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link" href="#">Login</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Register</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <div class="container-fluid">
        <header id="header" class="row vh-100 align-i-center text-light">
            <div class="col d-grid center-content-grid p-5">
                <img class="img-fluid" src="assets/imgs/websiteLogo.svg" alt="Logo do PokeCards">
            </div>
        </header>
        <section class="row">
            <div class="col-md text-center p-5">
                <img class="img-fluid" style="width: 40em;transform: rotate(56deg);" src="assets/imgs/magikarp.svg" alt="">
            </div>
            <div class="col-md align-self-center p-5">
                <h2>Aqui você pode procurar qualquer tipo de card Pokémon!</h2>
                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Quos quae fuga, quo at rem exercitationem
                    dicta distinctio, eligendi laudantium ipsam maxime cupiditate atque consequuntur obcaecati
                    nihil hic! Ipsa, saepe nostrum.</p>
            </div>
        </section>
        <section class="row t-orange-wave"></section>
        <section id="info-area" class="row text-light">
            <div class="col-md p-5">
                <h2>Mande para a gente uma sugestão para a API e como podemos melhorar!</h2>
                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Libero
                    nostrum commodi doloribus accusantium quis deserunt dolor
                    repudiandae aperiam minus. Consequatur eligendi vel, molestiae eius
                    at corporis quasi ut odit reprehenderit.</p>
            </div>
            <div class="col-md p-5">
                <h2>Formulário</h2>
                <form action="">
                    <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Email address</label>
                        <input type="email" class="form-control" id="exampleInputEmail1"
                            aria-describedby="emailHelp">
                    </div>
                    <div class="mb-3">
                        <label for="exampleInputPassword1" class="form-label">Sugestão</label>
                        <textarea name="" id="textArea" class="form-control" cols="30" rows="10"></textarea>
                    </div>
                    <div class="mb-3 form-check">
                        <input type="checkbox" class="form-check-input" id="exampleCheck1">
                        <label class="form-check-label" for="exampleCheck1">Check me out</label>
                    </div>
                    <button type="submit" class="btn btn-primary">Submit</button>
                </form>
            </div>
        </section>
        <section class="row b-orange-wave"></section>
        <section id="search" class="row text-center">
            <h3>Procure aqui um card</h3>
            <div id="navbar-column" class="col p-5">
                <ul class="nav justify-content-center">
                    <li class="nav-item">
                        <div>
                            <input type="text" name="" id="">
                            <input type="button" value="buscar">
                        </div>
                    </li>
                </ul>
            </div>
        </section>
    </div>
    <div class="container">
        <section id="cards" class="row row-cols-1 row-cols-md-4 row-cols-lg-5">
            <c:forEach items="${cards}" var="card">
                <a href="pokemon/${card.id}">
                    <div id="${card.id}" class="col">
                        <div class="card cards" style="border-radius: 2.25rem !important;">
                            <img src="${card.images.large}" class="card-img" alt="Pokemon card">
                        </div>
                    </div>
                </a>
            </c:forEach>
        </section>
        <div class="col text-center mt-3 mb-3">
            <button class="btn btn-dark" type="button">Carregar mais</button>
        </div>
    </div>
    <div class="container-fluid">
        <footer id="footer" class="row">
            <div class="col-md">
                <a class="icoLinkedin" href="https://www.linkedin.com/in/" title="Linkedin"><i
                        class="fa fa-linkedin"></i></a>
            </div>
            <div class="col-md">
                <a class="icoTwitter" href="https://twitter.com/" title="Twitter"><i
                        class="fa fa-twitter"></i></a>
            </div>
            <div class="col-md">
                <a class="icoFacebook" href="https://www.facebook.com/" title="Facebook"><i
                        class="fa fa-facebook"></i></a>
            </div>
        </footer>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-p34f1UUtsS3wqzfto5wAAmdvj+osOnFyQFpp4Ua3gs/ZVWx6oOypYoCJhGGScy+8"
        crossorigin="anonymous"></script>
</body>

</html>