package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionNameCurrencyRUIterator theCollection = (CollectionNameCurrencyRUIterator)findAncestorWithClass(this, CollectionNameCurrencyRUIterator.class);
			pageContext.getOut().print(theCollection.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

