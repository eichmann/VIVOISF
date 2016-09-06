package edu.uiowa.slis.VIVOISF.OrganizationName;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationNameLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNameLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNameLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationName theOrganizationName = (OrganizationName)findAncestorWithClass(this, OrganizationName.class);
			if (!theOrganizationName.commitNeeded) {
				pageContext.getOut().print(theOrganizationName.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing OrganizationName for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrganizationName for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			OrganizationName theOrganizationName = (OrganizationName)findAncestorWithClass(this, OrganizationName.class);
			return theOrganizationName.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing OrganizationName for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrganizationName for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			OrganizationName theOrganizationName = (OrganizationName)findAncestorWithClass(this, OrganizationName.class);
			theOrganizationName.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing OrganizationName for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrganizationName for label tag ");
		}
	}
}

