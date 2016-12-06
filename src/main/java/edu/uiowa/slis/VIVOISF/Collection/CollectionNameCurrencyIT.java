package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionNameCurrencyITIterator theCollection = (CollectionNameCurrencyITIterator)findAncestorWithClass(this, CollectionNameCurrencyITIterator.class);
			pageContext.getOut().print(theCollection.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

