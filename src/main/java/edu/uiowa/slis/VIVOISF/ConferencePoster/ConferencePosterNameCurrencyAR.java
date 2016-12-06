package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterNameCurrencyARIterator theConferencePoster = (ConferencePosterNameCurrencyARIterator)findAncestorWithClass(this, ConferencePosterNameCurrencyARIterator.class);
			pageContext.getOut().print(theConferencePoster.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

