package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNameCurrencyRUIterator theThing = (ThingNameCurrencyRUIterator)findAncestorWithClass(this, ThingNameCurrencyRUIterator.class);
			pageContext.getOut().print(theThing.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

