package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterNameCurrencyITIterator theConferencePoster = (ConferencePosterNameCurrencyITIterator)findAncestorWithClass(this, ConferencePosterNameCurrencyITIterator.class);
			pageContext.getOut().print(theConferencePoster.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

