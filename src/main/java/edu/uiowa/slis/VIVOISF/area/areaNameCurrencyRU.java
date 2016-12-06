package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(areaNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaNameCurrencyRUIterator thearea = (areaNameCurrencyRUIterator)findAncestorWithClass(this, areaNameCurrencyRUIterator.class);
			pageContext.getOut().print(thearea.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing area for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

