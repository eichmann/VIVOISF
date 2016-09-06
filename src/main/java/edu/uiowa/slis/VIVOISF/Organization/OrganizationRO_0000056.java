package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationRO_0000056Iterator theOrganizationRO_0000056Iterator = (OrganizationRO_0000056Iterator)findAncestorWithClass(this, OrganizationRO_0000056Iterator.class);
			pageContext.getOut().print(theOrganizationRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

