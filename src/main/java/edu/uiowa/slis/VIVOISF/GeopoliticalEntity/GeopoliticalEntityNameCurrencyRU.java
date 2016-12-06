package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityNameCurrencyRUIterator theGeopoliticalEntity = (GeopoliticalEntityNameCurrencyRUIterator)findAncestorWithClass(this, GeopoliticalEntityNameCurrencyRUIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

