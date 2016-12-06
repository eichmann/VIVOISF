package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNameCurrencyITIterator theConferencePaper = (ConferencePaperNameCurrencyITIterator)findAncestorWithClass(this, ConferencePaperNameCurrencyITIterator.class);
			pageContext.getOut().print(theConferencePaper.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

