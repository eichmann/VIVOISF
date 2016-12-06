package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNameCurrencyFRIterator theConferencePaper = (ConferencePaperNameCurrencyFRIterator)findAncestorWithClass(this, ConferencePaperNameCurrencyFRIterator.class);
			pageContext.getOut().print(theConferencePaper.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

