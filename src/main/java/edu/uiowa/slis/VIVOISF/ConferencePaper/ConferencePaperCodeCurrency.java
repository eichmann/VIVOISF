package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperCodeCurrencyIterator theConferencePaper = (ConferencePaperCodeCurrencyIterator)findAncestorWithClass(this, ConferencePaperCodeCurrencyIterator.class);
			pageContext.getOut().print(theConferencePaper.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

