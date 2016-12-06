package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionNameCurrencyFRIterator theCollection = (CollectionNameCurrencyFRIterator)findAncestorWithClass(this, CollectionNameCurrencyFRIterator.class);
			pageContext.getOut().print(theCollection.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

