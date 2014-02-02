<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>TasknGo &raquo; Gestion des Interventions</title>
    <link href="<c:url value="/resources/style.css" />" media="screen"  rel="stylesheet" type="text/css" />
    <style>
.errorblock {
	color: #ff0000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
	
}
</style>
</head>
<body>
<div class="container-fluid">
  <div class="content nohead grid">
    <div id="brandlarge">
        
            <h1><a href='/'>Task & Go</a></h1>
        
      <p>Gestion de mes interventions</p>
    </div>

    <!-- Modal Container -->
    <div class="modalcontainer thinbase">
      <div class="modalcontainer-header">
        <h3>Authentification</h3>
      </div>
      <div class="modalcontainer-body"> 
        <c:if test="${not empty error}">
		<div class="errorblock">
			Your login attempt was not successful, try again.<br /> Caused :
			${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
		</div>
	</c:if>
        <div class="row">
          <form class="span7 regform" action="<c:url value='j_spring_security_check' />" method='post'>
              <fieldset>
                
                <!-- Field -->
                <div class="row clearfix ">
                  <label class="span3" for='id_username'>
                      Identifiant
                  </label>
                  <div class="span4">
                      <input name="j_username" maxlength="75" autocapitalize="off" autocorrect="off"  required="required" id="id_username" />
                      
                  </div>
                </div><!-- /row -->

                <!-- Field -->
                <div class="row clearfix ">
                  <label class="span3" for='id_password'>
                      Mot de passe
                  </label>
                  <div class="span4">
                    <input type="password" name="j_password" id="id_password" required="required"/>
                    
                  </div>
                </div><!-- /row -->

              </fieldset>
              <div class="pull-right">
                <input type='submit' class='btn primary wide' value='Suivant &raquo;' />
              </div>
              

                
          </form>
        </div> <!-- /row -->
          
      </div> <!-- /modalcontainer-body -->
    </div> <!-- /modalcontainer -->
    
    <div class="modalcontainer thinbase2">
      <div class="modalcontainer-header">
        <h3>Inscription</h3>
      </div>
      <div class="modalcontainer-body"> 
        
    <div class="row">
        <form:form class="span7 " commandName="user" method="post">
            <fieldset>
                
                 <div class="row clearfix ">
                    <label class="span3" for="id_login">Login</label>
                    <div class="span4"><input name="login" maxlength="75" autocapitalize="off" autocorrect="off" required="required" id="id_login">
                      
                    </div>
                </div>
                <div class="row clearfix ">
                    <label class="span3" for="id_email">Adresse Email</label>
                    <div class="span4"><input name="mail" maxlength="75" autocapitalize="off" autocorrect="off" type="email" required="required" id="id_email">
                      
                    </div>
                </div>
                
                <div class="row clearfix ">
                    <label class="span3" for="id_confirm_email">Confirmez Email</label>
                    <div class="span4"><input name="confirm_mail" maxlength="75" autocapitalize="off" autocorrect="off" type="email" required="required" id="id_confirm_email">
                    
                    </div>
                </div>
                
                <div class="row clearfix ">
                    <label class="span3" for="id_pwd">Mot de passe</label>
                    <div class="span4"><input name="pwd" autocapitalize="off" autocorrect="off" type="password" required="required" id="id_pwd">
                    
                    </div>
                </div>
                
                <div class="row clearfix ">
                    <label class="span3" for="id_pwd2">Confirmez mot de passe</label>
                    <div class="span4"><input name="confirm_pwd" autocapitalize="off" autocorrect="off" type="password" required="required" id="id_pwd2">
                    
                    </div>
                </div>
                
                
            </fieldset>
            <div class="pull-right">
                <input type="submit" class="btn primary wide" value="Suivant »">
            </div>
           
        </form:form>
    </div>
          
      </div> <!-- /modalcontainer-body -->
    </div>

  </div>
</div> <!-- /container -->

  
  



</body>
</html>