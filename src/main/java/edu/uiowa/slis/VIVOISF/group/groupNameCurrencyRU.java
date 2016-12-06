package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(groupNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupNameCurrencyRUIterator thegroup = (groupNameCurrencyRUIterator)findAncestorWithClass(this, groupNameCurrencyRUIterator.class);
			pageContext.getOut().print(thegroup.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing group for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

