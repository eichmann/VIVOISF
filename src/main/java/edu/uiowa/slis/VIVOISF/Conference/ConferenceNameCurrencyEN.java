package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceNameCurrencyENIterator theConference = (ConferenceNameCurrencyENIterator)findAncestorWithClass(this, ConferenceNameCurrencyENIterator.class);
			pageContext.getOut().print(theConference.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

