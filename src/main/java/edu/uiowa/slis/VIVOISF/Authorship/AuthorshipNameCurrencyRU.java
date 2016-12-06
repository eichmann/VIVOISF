package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipNameCurrencyRUIterator theAuthorship = (AuthorshipNameCurrencyRUIterator)findAncestorWithClass(this, AuthorshipNameCurrencyRUIterator.class);
			pageContext.getOut().print(theAuthorship.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

