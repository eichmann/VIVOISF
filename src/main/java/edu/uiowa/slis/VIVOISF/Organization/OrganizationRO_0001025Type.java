package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationRO_0001025Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationRO_0001025Type currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationRO_0001025Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationRO_0001025Iterator theOrganizationRO_0001025Iterator = (OrganizationRO_0001025Iterator)findAncestorWithClass(this, OrganizationRO_0001025Iterator.class);
			pageContext.getOut().print(theOrganizationRO_0001025Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

