<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="template_superior.jsp"></jsp:include>       
            <h1> Formulario</h1>

            <form id="formPersona" method="post" action="AltaPersonaServlet" class="form-horizontal">

                <div class="form-group">
                    <label for="nombre" class="col-sm-2 control-label">Nombre</label>
                    <div class="col-sm-10">
                        <input name="nombre" type="text" class="form-control" id="nombre" placeholder="Nombre" required>
                    </div>
                </div>

                <div class="form-group">
                    <label for="apellido" class="col-sm-2 control-label">Apellido</label>
                    <div class="col-sm-10">
                        <input name="apellido" type="text" class="form-control" id="apellido" placeholder="Apellido" required>
                    </div>
                </div>

                <div class="form-group">
                    <label for="email" class="col-sm-2 control-label">Email</label>
                    <div class="col-sm-10">
                        <input name="email" type="email" class="form-control" id="email" placeholder="Email" required>
                    </div>
                </div>

                <div class="form-group">
                    <label for="localidad" class="col-sm-2 control-label">Localidad</label>
                    <div class="col-sm-10">
                        <select name="localidad" class="form-control" id="localidad" required>
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                        </select>
                    </div>
                </div>

                <div class="form-group">
                    <label for="notas" class="col-sm-2 control-label">Notas</label>
                    <div class="col-sm-10">
                        <textarea name="notas" class="form-control" id="notas" rows="3" required></textarea>
                    </div>
                </div>
                
                <div class="form-group">
                    <label for="sueldo" class="col-sm-2 control-label">Sueldo</label>
                    <div class="col-sm-10">
                        <input name="sueldo" type="number" class="form-control" id="apellido" placeholder="Sueldo" required>
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-primary">Guardar</button>
                    </div>
                </div>

            </form>
            
<jsp:include page="template_inferior.jsp"></jsp:include>    