package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceNameCurrencyARIterator theConference = (ConferenceNameCurrencyARIterator)findAncestorWithClass(this, ConferenceNameCurrencyARIterator.class);
			pageContext.getOut().print(theConference.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

