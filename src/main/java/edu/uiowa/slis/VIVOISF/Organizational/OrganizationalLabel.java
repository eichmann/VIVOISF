package edu.uiowa.slis.VIVOISF.Organizational;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationalLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationalLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationalLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Organizational theOrganizational = (Organizational)findAncestorWithClass(this, Organizational.class);
			if (!theOrganizational.commitNeeded) {
				pageContext.getOut().print(theOrganizational.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Organizational for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organizational for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Organizational theOrganizational = (Organizational)findAncestorWithClass(this, Organizational.class);
			return theOrganizational.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Organizational for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organizational for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Organizational theOrganizational = (Organizational)findAncestorWithClass(this, Organizational.class);
			theOrganizational.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Organizational for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organizational for label tag ");
		}
	}
}

