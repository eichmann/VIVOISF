package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionNameCurrencyRUIterator theeconomic_region = (economic_regionNameCurrencyRUIterator)findAncestorWithClass(this, economic_regionNameCurrencyRUIterator.class);
			pageContext.getOut().print(theeconomic_region.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

