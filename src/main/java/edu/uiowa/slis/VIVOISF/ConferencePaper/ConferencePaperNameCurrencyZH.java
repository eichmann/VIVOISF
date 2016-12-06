package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNameCurrencyZHIterator theConferencePaper = (ConferencePaperNameCurrencyZHIterator)findAncestorWithClass(this, ConferencePaperNameCurrencyZHIterator.class);
			pageContext.getOut().print(theConferencePaper.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

