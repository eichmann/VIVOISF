package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionCodeCurrencyIterator thePostdocPosition = (PostdocPositionCodeCurrencyIterator)findAncestorWithClass(this, PostdocPositionCodeCurrencyIterator.class);
			pageContext.getOut().print(thePostdocPosition.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

