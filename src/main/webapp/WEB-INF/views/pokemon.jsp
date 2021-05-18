<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous">
    <script src="https://kit.fontawesome.com/26cf4bd766.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="../assets/css/styles.css" />
    <title>PokeCards - ${card.name}</title>
</head>
<body>
    <nav id="navigation" class="navbar navbar-expand-lg navbar-light">
        <div class="container-fluid">
            <a class="navbar-brand d-block d-sm-block d-lg-none" href="/">
                <img class="nav-logo" src="../assets/imgs/navlogo.svg" alt="Logo PokeCards">
            </a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link" href="/">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Cardbox</a>
                    </li>
                </ul>
                <ul class="navbar-nav d-none d-lg-block me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a href="/">
                            <img class="nav-logo" src="../assets/imgs/navlogo.svg" alt="Logo PokeCards"/>
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
        <c:choose>
            <c:when test="${card.types.get(0) eq 'Water'}">
                <div id="card-header-display" style="background-color: #59a7e4;" class="row vh-50">
                    <div style="position: absolute; bottom: -175px;" class="col-md  text-center p-5">
                        <img id="card-display" class="mb-3" src="${card.images.large}" alt="">
                        <h1>${card.name}</h1>
                    </div>
                </div>
            </c:when>
            <c:when test="${card.types.get(0) eq 'Grass'}">
                <div id="card-header-display" style="background-color: #54b43b;" class="row vh-50">
                    <div style="position: absolute; bottom: -175px;" class="col-md  text-center p-5">
                        <img id="card-display" class="mb-3" src="${card.images.large}" alt="">
                        <h1>${card.name}</h1>
                    </div>
                </div>
            </c:when>
        </c:choose>
        <div class="row vh-30"></div>
        <div id="" class="row">
            <div class="col-md text-center">
                <h2>Infos aqui</h2>
            </div>
        </div>
    </div>
    
</body>
</html>