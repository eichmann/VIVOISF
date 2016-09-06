package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationIAO_0000136Iterator theOrganizationIAO_0000136Iterator = (OrganizationIAO_0000136Iterator)findAncestorWithClass(this, OrganizationIAO_0000136Iterator.class);
			pageContext.getOut().print(theOrganizationIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

