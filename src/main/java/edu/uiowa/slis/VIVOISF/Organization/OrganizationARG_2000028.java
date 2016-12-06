package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationARG_2000028 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationARG_2000028 currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationARG_2000028.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationARG_2000028Iterator theOrganizationARG_2000028Iterator = (OrganizationARG_2000028Iterator)findAncestorWithClass(this, OrganizationARG_2000028Iterator.class);
			pageContext.getOut().print(theOrganizationARG_2000028Iterator.getARG_2000028());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

