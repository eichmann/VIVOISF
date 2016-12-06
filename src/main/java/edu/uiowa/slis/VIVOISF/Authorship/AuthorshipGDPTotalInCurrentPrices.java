package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipGDPTotalInCurrentPricesIterator theAuthorship = (AuthorshipGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, AuthorshipGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theAuthorship.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

