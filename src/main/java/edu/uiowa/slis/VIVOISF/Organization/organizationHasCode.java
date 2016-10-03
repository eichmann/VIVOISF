package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationHasCode extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationHasCode currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationHasCode.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			organizationHasCodeIterator theorganization = (organizationHasCodeIterator)findAncestorWithClass(this, organizationHasCodeIterator.class);
			pageContext.getOut().print(theorganization.getHasCode());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for hasCode tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for hasCode tag ");
		}
		return SKIP_BODY;
	}
}

