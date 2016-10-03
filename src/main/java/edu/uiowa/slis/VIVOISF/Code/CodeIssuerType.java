package edu.uiowa.slis.VIVOISF.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CodeIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CodeIssuerIterator theCodeIssuerIterator = (CodeIssuerIterator)findAncestorWithClass(this, CodeIssuerIterator.class);
			pageContext.getOut().print(theCodeIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for issuer tag ");
		}
		return SKIP_BODY;
	}
}

