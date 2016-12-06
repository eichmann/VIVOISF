package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceNameCurrencyESIterator theConference = (ConferenceNameCurrencyESIterator)findAncestorWithClass(this, ConferenceNameCurrencyESIterator.class);
			pageContext.getOut().print(theConference.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

