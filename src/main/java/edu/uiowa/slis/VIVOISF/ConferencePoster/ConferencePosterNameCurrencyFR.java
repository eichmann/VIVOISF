package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterNameCurrencyFRIterator theConferencePoster = (ConferencePosterNameCurrencyFRIterator)findAncestorWithClass(this, ConferencePosterNameCurrencyFRIterator.class);
			pageContext.getOut().print(theConferencePoster.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

