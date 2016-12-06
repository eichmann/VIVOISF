package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceNameCurrencyRUIterator theConference = (ConferenceNameCurrencyRUIterator)findAncestorWithClass(this, ConferenceNameCurrencyRUIterator.class);
			pageContext.getOut().print(theConference.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

