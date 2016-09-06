package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Organization theOrganization = (Organization)findAncestorWithClass(this, Organization.class);
			if (!theOrganization.commitNeeded) {
				pageContext.getOut().print(theOrganization.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			Organization theOrganization = (Organization)findAncestorWithClass(this, Organization.class);
			return theOrganization.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing Organization for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			Organization theOrganization = (Organization)findAncestorWithClass(this, Organization.class);
			theOrganization.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for overview tag ");
		}
	}
}

