package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryNameCurrencyRUIterator theterritory = (territoryNameCurrencyRUIterator)findAncestorWithClass(this, territoryNameCurrencyRUIterator.class);
			pageContext.getOut().print(theterritory.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

