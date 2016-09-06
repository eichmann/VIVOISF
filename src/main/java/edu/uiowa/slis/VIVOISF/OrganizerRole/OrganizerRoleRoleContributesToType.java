package edu.uiowa.slis.VIVOISF.OrganizerRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizerRoleRoleContributesToType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizerRoleRoleContributesToType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizerRoleRoleContributesToType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizerRoleRoleContributesToIterator theOrganizerRoleRoleContributesToIterator = (OrganizerRoleRoleContributesToIterator)findAncestorWithClass(this, OrganizerRoleRoleContributesToIterator.class);
			pageContext.getOut().print(theOrganizerRoleRoleContributesToIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OrganizerRole for roleContributesTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrganizerRole for roleContributesTo tag ");
		}
		return SKIP_BODY;
	}
}

