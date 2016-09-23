package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationSameAs extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationSameAs currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationSameAs.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			organizationSameAsIterator theorganization = (organizationSameAsIterator)findAncestorWithClass(this, organizationSameAsIterator.class);
			pageContext.getOut().print(theorganization.getSameAs());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

