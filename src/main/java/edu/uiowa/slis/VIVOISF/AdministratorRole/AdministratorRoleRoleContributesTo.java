package edu.uiowa.slis.VIVOISF.AdministratorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AdministratorRoleRoleContributesTo extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AdministratorRoleRoleContributesTo currentInstance = null;
	private static final Log log = LogFactory.getLog(AdministratorRoleRoleContributesTo.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AdministratorRoleRoleContributesToIterator theAdministratorRoleRoleContributesToIterator = (AdministratorRoleRoleContributesToIterator)findAncestorWithClass(this, AdministratorRoleRoleContributesToIterator.class);
			pageContext.getOut().print(theAdministratorRoleRoleContributesToIterator.getRoleContributesTo());
		} catch (Exception e) {
			log.error("Can't find enclosing AdministratorRole for roleContributesTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdministratorRole for roleContributesTo tag ");
		}
		return SKIP_BODY;
	}
}

