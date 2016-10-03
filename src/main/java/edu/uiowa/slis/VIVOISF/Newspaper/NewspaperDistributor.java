package edu.uiowa.slis.VIVOISF.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewspaperDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperDistributorIterator theNewspaperDistributorIterator = (NewspaperDistributorIterator)findAncestorWithClass(this, NewspaperDistributorIterator.class);
			pageContext.getOut().print(theNewspaperDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for distributor tag ");
		}
		return SKIP_BODY;
	}
}

