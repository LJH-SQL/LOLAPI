<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp"/>
<!DOCTYPE html>
<html>
<header class="masthead bg-primary text-white text-center">
<h1>account Id : ${response.accountId}</h1>
<h1>puuid : ${response.puuid}</h1>
<h1>name : ${response.name}</h1>
<h1>profileIconId :${response.profileIconId}</h1>
<h1>revisionDate : ${response.revisionDate}</h1>
<h1>summonerLevel : ${response.summonerLevel}</h1>
</header>
<jsp:include page="bottom.jsp"/>
</html>