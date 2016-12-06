package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Organization theOrganization = (Organization)findAncestorWithClass(this, Organization.class);
			if (!theOrganization.commitNeeded) {
				pageContext.getOut().print(theOrganization.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			Organization theOrganization = (Organization)findAncestorWithClass(this, Organization.class);
			return theOrganization.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing Organization for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			Organization theOrganization = (Organization)findAncestorWithClass(this, Organization.class);
			theOrganization.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for placeOfPublication tag ");
		}
	}
}

