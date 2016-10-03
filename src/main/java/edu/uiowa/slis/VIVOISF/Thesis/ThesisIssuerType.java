package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisIssuerIterator theThesisIssuerIterator = (ThesisIssuerIterator)findAncestorWithClass(this, ThesisIssuerIterator.class);
			pageContext.getOut().print(theThesisIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for issuer tag ");
		}
		return SKIP_BODY;
	}
}

