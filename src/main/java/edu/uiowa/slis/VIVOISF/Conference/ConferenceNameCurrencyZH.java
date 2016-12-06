package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceNameCurrencyZHIterator theConference = (ConferenceNameCurrencyZHIterator)findAncestorWithClass(this, ConferenceNameCurrencyZHIterator.class);
			pageContext.getOut().print(theConference.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

