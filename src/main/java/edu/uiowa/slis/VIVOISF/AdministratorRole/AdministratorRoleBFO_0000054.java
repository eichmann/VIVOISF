package edu.uiowa.slis.VIVOISF.AdministratorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AdministratorRoleBFO_0000054 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AdministratorRoleBFO_0000054 currentInstance = null;
	private static final Log log = LogFactory.getLog(AdministratorRoleBFO_0000054.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AdministratorRoleBFO_0000054Iterator theAdministratorRoleBFO_0000054Iterator = (AdministratorRoleBFO_0000054Iterator)findAncestorWithClass(this, AdministratorRoleBFO_0000054Iterator.class);
			pageContext.getOut().print(theAdministratorRoleBFO_0000054Iterator.getBFO_0000054());
		} catch (Exception e) {
			log.error("Can't find enclosing AdministratorRole for BFO_0000054 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdministratorRole for BFO_0000054 tag ");
		}
		return SKIP_BODY;
	}
}

