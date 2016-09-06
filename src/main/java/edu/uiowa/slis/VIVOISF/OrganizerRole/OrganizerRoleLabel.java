package edu.uiowa.slis.VIVOISF.OrganizerRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizerRoleLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizerRoleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizerRoleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			OrganizerRole theOrganizerRole = (OrganizerRole)findAncestorWithClass(this, OrganizerRole.class);
			if (!theOrganizerRole.commitNeeded) {
				pageContext.getOut().print(theOrganizerRole.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing OrganizerRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrganizerRole for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			OrganizerRole theOrganizerRole = (OrganizerRole)findAncestorWithClass(this, OrganizerRole.class);
			return theOrganizerRole.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing OrganizerRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrganizerRole for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			OrganizerRole theOrganizerRole = (OrganizerRole)findAncestorWithClass(this, OrganizerRole.class);
			theOrganizerRole.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing OrganizerRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrganizerRole for label tag ");
		}
	}
}

