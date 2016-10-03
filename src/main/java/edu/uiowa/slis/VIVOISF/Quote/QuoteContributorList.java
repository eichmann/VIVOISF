package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteContributorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteContributorList currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteContributorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			QuoteContributorListIterator theQuoteContributorListIterator = (QuoteContributorListIterator)findAncestorWithClass(this, QuoteContributorListIterator.class);
			pageContext.getOut().print(theQuoteContributorListIterator.getContributorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

