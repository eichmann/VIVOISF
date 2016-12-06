package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterNameCurrencyRUIterator theConferencePoster = (ConferencePosterNameCurrencyRUIterator)findAncestorWithClass(this, ConferencePosterNameCurrencyRUIterator.class);
			pageContext.getOut().print(theConferencePoster.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

