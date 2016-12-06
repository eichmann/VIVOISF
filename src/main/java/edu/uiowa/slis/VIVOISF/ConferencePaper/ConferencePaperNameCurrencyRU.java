package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNameCurrencyRUIterator theConferencePaper = (ConferencePaperNameCurrencyRUIterator)findAncestorWithClass(this, ConferencePaperNameCurrencyRUIterator.class);
			pageContext.getOut().print(theConferencePaper.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

