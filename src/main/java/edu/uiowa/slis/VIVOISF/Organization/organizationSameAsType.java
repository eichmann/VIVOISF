package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationSameAsType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationSameAsType currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationSameAsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			organizationSameAsIterator theorganizationSameAsIterator = (organizationSameAsIterator)findAncestorWithClass(this, organizationSameAsIterator.class);
			pageContext.getOut().print(theorganizationSameAsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

