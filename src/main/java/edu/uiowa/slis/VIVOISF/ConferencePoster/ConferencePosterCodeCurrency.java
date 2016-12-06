package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterCodeCurrencyIterator theConferencePoster = (ConferencePosterCodeCurrencyIterator)findAncestorWithClass(this, ConferencePosterCodeCurrencyIterator.class);
			pageContext.getOut().print(theConferencePoster.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

