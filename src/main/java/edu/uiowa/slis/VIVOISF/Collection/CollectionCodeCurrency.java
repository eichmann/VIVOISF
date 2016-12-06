package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionCodeCurrencyIterator theCollection = (CollectionCodeCurrencyIterator)findAncestorWithClass(this, CollectionCodeCurrencyIterator.class);
			pageContext.getOut().print(theCollection.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

