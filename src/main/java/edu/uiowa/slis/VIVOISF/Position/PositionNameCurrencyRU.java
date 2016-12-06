package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionNameCurrencyRUIterator thePosition = (PositionNameCurrencyRUIterator)findAncestorWithClass(this, PositionNameCurrencyRUIterator.class);
			pageContext.getOut().print(thePosition.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

