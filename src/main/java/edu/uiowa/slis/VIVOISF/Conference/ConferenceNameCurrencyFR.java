package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceNameCurrencyFRIterator theConference = (ConferenceNameCurrencyFRIterator)findAncestorWithClass(this, ConferenceNameCurrencyFRIterator.class);
			pageContext.getOut().print(theConference.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

