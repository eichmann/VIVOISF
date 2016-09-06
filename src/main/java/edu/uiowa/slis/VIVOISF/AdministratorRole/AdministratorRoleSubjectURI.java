package edu.uiowa.slis.VIVOISF.AdministratorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AdministratorRoleSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AdministratorRoleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(AdministratorRoleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AdministratorRole theAdministratorRole = (AdministratorRole)findAncestorWithClass(this, AdministratorRole.class);
			if (!theAdministratorRole.commitNeeded) {
				pageContext.getOut().print(theAdministratorRole.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AdministratorRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdministratorRole for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			AdministratorRole theAdministratorRole = (AdministratorRole)findAncestorWithClass(this, AdministratorRole.class);
			return theAdministratorRole.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing AdministratorRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdministratorRole for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			AdministratorRole theAdministratorRole = (AdministratorRole)findAncestorWithClass(this, AdministratorRole.class);
			theAdministratorRole.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing AdministratorRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdministratorRole for subjectURI tag ");
		}
	}
}

