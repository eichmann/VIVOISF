package edu.uiowa.slis.VIVOISF.BFO_0000141;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000141NameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000141NameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000141NameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000141NameCurrencyRUIterator theBFO_0000141 = (BFO_0000141NameCurrencyRUIterator)findAncestorWithClass(this, BFO_0000141NameCurrencyRUIterator.class);
			pageContext.getOut().print(theBFO_0000141.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000141 for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000141 for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

