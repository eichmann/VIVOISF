package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationRO_0001015 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationRO_0001015 currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationRO_0001015.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationRO_0001015Iterator theOrganizationRO_0001015Iterator = (OrganizationRO_0001015Iterator)findAncestorWithClass(this, OrganizationRO_0001015Iterator.class);
			pageContext.getOut().print(theOrganizationRO_0001015Iterator.getRO_0001015());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

