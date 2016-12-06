package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNameCurrencyESIterator theConferencePaper = (ConferencePaperNameCurrencyESIterator)findAncestorWithClass(this, ConferencePaperNameCurrencyESIterator.class);
			pageContext.getOut().print(theConferencePaper.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

