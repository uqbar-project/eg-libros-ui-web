<%@ page isELIgnored ="false" pageEncoding="UTF-8" %> 
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
		<center>
			<h2>Detalle de libro</h2>
			<table>
				<tr>
					<th>T&iacute;tulo</th>
					<td>${buscador.libroActual.titulo}</td>
				</tr>					
				<tr>
					<th>Autor</th>
					<td>${buscador.libroActual.autor}</td>
				</tr>
			</table>
			
			<c:if test="${buscador.puedeAnterior}">
				<a href="javascript:cambiarLibro(${buscador.posicionLibroActual - 1});">Anterior</a>
			</c:if>					
			<c:if test="${buscador.puedeSiguiente}">
				<a href="javascript:cambiarLibro(${buscador.posicionLibroActual + 1});">Siguiente</a>
			</c:if>		
		</center>
