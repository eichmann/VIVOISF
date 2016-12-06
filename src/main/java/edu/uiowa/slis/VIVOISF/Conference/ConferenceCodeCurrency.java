package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceCodeCurrencyIterator theConference = (ConferenceCodeCurrencyIterator)findAncestorWithClass(this, ConferenceCodeCurrencyIterator.class);
			pageContext.getOut().print(theConference.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

