package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionNameCurrencyARIterator theCollection = (CollectionNameCurrencyARIterator)findAncestorWithClass(this, CollectionNameCurrencyARIterator.class);
			pageContext.getOut().print(theCollection.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

