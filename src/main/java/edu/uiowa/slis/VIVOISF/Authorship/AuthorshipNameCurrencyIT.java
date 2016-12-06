package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipNameCurrencyITIterator theAuthorship = (AuthorshipNameCurrencyITIterator)findAncestorWithClass(this, AuthorshipNameCurrencyITIterator.class);
			pageContext.getOut().print(theAuthorship.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

