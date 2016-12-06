package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNameCurrencyARIterator theConferencePaper = (ConferencePaperNameCurrencyARIterator)findAncestorWithClass(this, ConferencePaperNameCurrencyARIterator.class);
			pageContext.getOut().print(theConferencePaper.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

