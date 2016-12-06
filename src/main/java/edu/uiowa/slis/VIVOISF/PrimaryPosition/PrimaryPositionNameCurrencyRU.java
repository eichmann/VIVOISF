package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionNameCurrencyRUIterator thePrimaryPosition = (PrimaryPositionNameCurrencyRUIterator)findAncestorWithClass(this, PrimaryPositionNameCurrencyRUIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

