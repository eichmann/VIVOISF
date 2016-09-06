package edu.uiowa.slis.VIVOISF.AdministratorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AdministratorRoleLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AdministratorRoleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(AdministratorRoleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AdministratorRole theAdministratorRole = (AdministratorRole)findAncestorWithClass(this, AdministratorRole.class);
			if (!theAdministratorRole.commitNeeded) {
				pageContext.getOut().print(theAdministratorRole.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AdministratorRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdministratorRole for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			AdministratorRole theAdministratorRole = (AdministratorRole)findAncestorWithClass(this, AdministratorRole.class);
			return theAdministratorRole.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing AdministratorRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdministratorRole for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			AdministratorRole theAdministratorRole = (AdministratorRole)findAncestorWithClass(this, AdministratorRole.class);
			theAdministratorRole.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing AdministratorRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdministratorRole for label tag ");
		}
	}
}

