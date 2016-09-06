package edu.uiowa.slis.VIVOISF.OrganizerRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizerRoleRO_0000052Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizerRoleRO_0000052Type currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizerRoleRO_0000052Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizerRoleRO_0000052Iterator theOrganizerRoleRO_0000052Iterator = (OrganizerRoleRO_0000052Iterator)findAncestorWithClass(this, OrganizerRoleRO_0000052Iterator.class);
			pageContext.getOut().print(theOrganizerRoleRO_0000052Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OrganizerRole for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrganizerRole for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}

