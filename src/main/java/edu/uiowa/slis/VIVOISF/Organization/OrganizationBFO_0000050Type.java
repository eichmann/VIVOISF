package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationBFO_0000050Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationBFO_0000050Type currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationBFO_0000050Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationBFO_0000050Iterator theOrganizationBFO_0000050Iterator = (OrganizationBFO_0000050Iterator)findAncestorWithClass(this, OrganizationBFO_0000050Iterator.class);
			pageContext.getOut().print(theOrganizationBFO_0000050Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

