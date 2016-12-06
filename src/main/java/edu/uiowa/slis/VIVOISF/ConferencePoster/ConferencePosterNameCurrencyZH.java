package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterNameCurrencyZHIterator theConferencePoster = (ConferencePosterNameCurrencyZHIterator)findAncestorWithClass(this, ConferencePosterNameCurrencyZHIterator.class);
			pageContext.getOut().print(theConferencePoster.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

