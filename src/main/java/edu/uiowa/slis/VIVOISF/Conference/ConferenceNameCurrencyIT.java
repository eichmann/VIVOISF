package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceNameCurrencyITIterator theConference = (ConferenceNameCurrencyITIterator)findAncestorWithClass(this, ConferenceNameCurrencyITIterator.class);
			pageContext.getOut().print(theConference.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

