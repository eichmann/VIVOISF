package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipNameCurrencyFRIterator theAuthorship = (AuthorshipNameCurrencyFRIterator)findAncestorWithClass(this, AuthorshipNameCurrencyFRIterator.class);
			pageContext.getOut().print(theAuthorship.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

