package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNameCurrencyENIterator theConferencePaper = (ConferencePaperNameCurrencyENIterator)findAncestorWithClass(this, ConferencePaperNameCurrencyENIterator.class);
			pageContext.getOut().print(theConferencePaper.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

