package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipNameCurrencyENIterator theAuthorship = (AuthorshipNameCurrencyENIterator)findAncestorWithClass(this, AuthorshipNameCurrencyENIterator.class);
			pageContext.getOut().print(theAuthorship.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

