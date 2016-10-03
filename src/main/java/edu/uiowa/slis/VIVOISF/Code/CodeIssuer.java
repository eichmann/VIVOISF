package edu.uiowa.slis.VIVOISF.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CodeIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CodeIssuerIterator theCodeIssuerIterator = (CodeIssuerIterator)findAncestorWithClass(this, CodeIssuerIterator.class);
			pageContext.getOut().print(theCodeIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for issuer tag ");
		}
		return SKIP_BODY;
	}
}

