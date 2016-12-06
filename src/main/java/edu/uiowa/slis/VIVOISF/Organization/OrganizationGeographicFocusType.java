package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationGeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationGeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationGeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationGeographicFocusIterator theOrganizationGeographicFocusIterator = (OrganizationGeographicFocusIterator)findAncestorWithClass(this, OrganizationGeographicFocusIterator.class);
			pageContext.getOut().print(theOrganizationGeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

