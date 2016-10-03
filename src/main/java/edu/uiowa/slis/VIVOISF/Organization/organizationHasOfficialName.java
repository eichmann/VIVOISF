package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationHasOfficialName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationHasOfficialName currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationHasOfficialName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			organizationHasOfficialNameIterator theorganization = (organizationHasOfficialNameIterator)findAncestorWithClass(this, organizationHasOfficialNameIterator.class);
			pageContext.getOut().print(theorganization.getHasOfficialName());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for hasOfficialName tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for hasOfficialName tag ");
		}
		return SKIP_BODY;
	}
}

