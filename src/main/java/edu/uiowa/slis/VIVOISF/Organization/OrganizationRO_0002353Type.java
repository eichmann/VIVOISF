package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationRO_0002353Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationRO_0002353Type currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationRO_0002353Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationRO_0002353Iterator theOrganizationRO_0002353Iterator = (OrganizationRO_0002353Iterator)findAncestorWithClass(this, OrganizationRO_0002353Iterator.class);
			pageContext.getOut().print(theOrganizationRO_0002353Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

