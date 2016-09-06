package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingNameCurrencyRUIterator theself_governing = (self_governingNameCurrencyRUIterator)findAncestorWithClass(this, self_governingNameCurrencyRUIterator.class);
			pageContext.getOut().print(theself_governing.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

