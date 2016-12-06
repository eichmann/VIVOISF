package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipNameCurrencyZHIterator theAuthorship = (AuthorshipNameCurrencyZHIterator)findAncestorWithClass(this, AuthorshipNameCurrencyZHIterator.class);
			pageContext.getOut().print(theAuthorship.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

