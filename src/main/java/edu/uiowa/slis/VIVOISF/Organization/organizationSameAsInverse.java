package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationSameAsInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationSameAsInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationSameAsInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			organizationSameAsInverseIterator theorganizationSameAsInverseIterator = (organizationSameAsInverseIterator)findAncestorWithClass(this, organizationSameAsInverseIterator.class);
			pageContext.getOut().print(theorganizationSameAsInverseIterator.getSameAsInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

