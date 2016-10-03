package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LetterIssuerIterator theLetterIssuerIterator = (LetterIssuerIterator)findAncestorWithClass(this, LetterIssuerIterator.class);
			pageContext.getOut().print(theLetterIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for issuer tag ");
		}
		return SKIP_BODY;
	}
}

