package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StandardIssuerIterator theStandardIssuerIterator = (StandardIssuerIterator)findAncestorWithClass(this, StandardIssuerIterator.class);
			pageContext.getOut().print(theStandardIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for issuer tag ");
		}
		return SKIP_BODY;
	}
}

