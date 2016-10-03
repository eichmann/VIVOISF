package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LetterIssuerIterator theLetterIssuerIterator = (LetterIssuerIterator)findAncestorWithClass(this, LetterIssuerIterator.class);
			pageContext.getOut().print(theLetterIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for issuer tag ");
		}
		return SKIP_BODY;
	}
}

