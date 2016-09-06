package edu.uiowa.slis.VIVOISF.OrganizationUnitName;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationUnitNameLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationUnitNameLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationUnitNameLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationUnitName theOrganizationUnitName = (OrganizationUnitName)findAncestorWithClass(this, OrganizationUnitName.class);
			if (!theOrganizationUnitName.commitNeeded) {
				pageContext.getOut().print(theOrganizationUnitName.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing OrganizationUnitName for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrganizationUnitName for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			OrganizationUnitName theOrganizationUnitName = (OrganizationUnitName)findAncestorWithClass(this, OrganizationUnitName.class);
			return theOrganizationUnitName.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing OrganizationUnitName for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrganizationUnitName for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			OrganizationUnitName theOrganizationUnitName = (OrganizationUnitName)findAncestorWithClass(this, OrganizationUnitName.class);
			theOrganizationUnitName.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing OrganizationUnitName for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrganizationUnitName for label tag ");
		}
	}
}

