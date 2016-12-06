package edu.uiowa.slis.VIVOISF.IAO_0000003;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000003NameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000003NameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000003NameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000003NameCurrencyRUIterator theIAO_0000003 = (IAO_0000003NameCurrencyRUIterator)findAncestorWithClass(this, IAO_0000003NameCurrencyRUIterator.class);
			pageContext.getOut().print(theIAO_0000003.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000003 for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000003 for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

