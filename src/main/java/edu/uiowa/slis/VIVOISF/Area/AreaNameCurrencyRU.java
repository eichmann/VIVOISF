package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaNameCurrencyRUIterator theArea = (AreaNameCurrencyRUIterator)findAncestorWithClass(this, AreaNameCurrencyRUIterator.class);
			pageContext.getOut().print(theArea.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

