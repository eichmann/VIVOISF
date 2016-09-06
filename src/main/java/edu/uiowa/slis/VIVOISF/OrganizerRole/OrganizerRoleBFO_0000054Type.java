package edu.uiowa.slis.VIVOISF.OrganizerRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizerRoleBFO_0000054Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizerRoleBFO_0000054Type currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizerRoleBFO_0000054Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizerRoleBFO_0000054Iterator theOrganizerRoleBFO_0000054Iterator = (OrganizerRoleBFO_0000054Iterator)findAncestorWithClass(this, OrganizerRoleBFO_0000054Iterator.class);
			pageContext.getOut().print(theOrganizerRoleBFO_0000054Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OrganizerRole for BFO_0000054 tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrganizerRole for BFO_0000054 tag ");
		}
		return SKIP_BODY;
	}
}

