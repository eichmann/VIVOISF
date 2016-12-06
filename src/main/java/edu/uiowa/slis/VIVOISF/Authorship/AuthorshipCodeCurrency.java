package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipCodeCurrencyIterator theAuthorship = (AuthorshipCodeCurrencyIterator)findAncestorWithClass(this, AuthorshipCodeCurrencyIterator.class);
			pageContext.getOut().print(theAuthorship.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

