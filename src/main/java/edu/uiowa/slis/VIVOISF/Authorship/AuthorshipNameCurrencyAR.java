package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipNameCurrencyARIterator theAuthorship = (AuthorshipNameCurrencyARIterator)findAncestorWithClass(this, AuthorshipNameCurrencyARIterator.class);
			pageContext.getOut().print(theAuthorship.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

