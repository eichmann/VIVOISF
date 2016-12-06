package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterNameCurrencyENIterator theConferencePoster = (ConferencePosterNameCurrencyENIterator)findAncestorWithClass(this, ConferencePosterNameCurrencyENIterator.class);
			pageContext.getOut().print(theConferencePoster.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

