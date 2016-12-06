package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipNameCurrencyESIterator theAuthorship = (AuthorshipNameCurrencyESIterator)findAncestorWithClass(this, AuthorshipNameCurrencyESIterator.class);
			pageContext.getOut().print(theAuthorship.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

