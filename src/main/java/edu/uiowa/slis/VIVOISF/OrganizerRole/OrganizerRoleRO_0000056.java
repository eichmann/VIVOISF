package edu.uiowa.slis.VIVOISF.OrganizerRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizerRoleRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizerRoleRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizerRoleRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizerRoleRO_0000056Iterator theOrganizerRoleRO_0000056Iterator = (OrganizerRoleRO_0000056Iterator)findAncestorWithClass(this, OrganizerRoleRO_0000056Iterator.class);
			pageContext.getOut().print(theOrganizerRoleRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing OrganizerRole for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrganizerRole for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

