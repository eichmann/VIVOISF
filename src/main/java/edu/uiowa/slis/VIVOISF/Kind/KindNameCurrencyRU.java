package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(KindNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindNameCurrencyRUIterator theKind = (KindNameCurrencyRUIterator)findAncestorWithClass(this, KindNameCurrencyRUIterator.class);
			pageContext.getOut().print(theKind.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

