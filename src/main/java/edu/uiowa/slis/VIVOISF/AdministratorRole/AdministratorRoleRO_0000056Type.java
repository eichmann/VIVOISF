package edu.uiowa.slis.VIVOISF.AdministratorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AdministratorRoleRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AdministratorRoleRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(AdministratorRoleRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AdministratorRoleRO_0000056Iterator theAdministratorRoleRO_0000056Iterator = (AdministratorRoleRO_0000056Iterator)findAncestorWithClass(this, AdministratorRoleRO_0000056Iterator.class);
			pageContext.getOut().print(theAdministratorRoleRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AdministratorRole for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdministratorRole for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

