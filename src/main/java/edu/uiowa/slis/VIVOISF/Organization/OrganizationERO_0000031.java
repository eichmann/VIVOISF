package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationERO_0000031 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationERO_0000031 currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationERO_0000031.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationERO_0000031Iterator theOrganizationERO_0000031Iterator = (OrganizationERO_0000031Iterator)findAncestorWithClass(this, OrganizationERO_0000031Iterator.class);
			pageContext.getOut().print(theOrganizationERO_0000031Iterator.getERO_0000031());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for ERO_0000031 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for ERO_0000031 tag ");
		}
		return SKIP_BODY;
	}
}

