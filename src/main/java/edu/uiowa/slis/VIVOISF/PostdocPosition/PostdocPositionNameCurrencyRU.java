package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionNameCurrencyRUIterator thePostdocPosition = (PostdocPositionNameCurrencyRUIterator)findAncestorWithClass(this, PostdocPositionNameCurrencyRUIterator.class);
			pageContext.getOut().print(thePostdocPosition.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

