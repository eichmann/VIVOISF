package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Organization theOrganization = (Organization)findAncestorWithClass(this, Organization.class);
			if (!theOrganization.commitNeeded) {
				pageContext.getOut().print(theOrganization.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Organization theOrganization = (Organization)findAncestorWithClass(this, Organization.class);
			return theOrganization.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Organization for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Organization theOrganization = (Organization)findAncestorWithClass(this, Organization.class);
			theOrganization.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for abbreviation tag ");
		}
	}
}

