package edu.uiowa.slis.VIVOISF.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewspaperDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperDistributorIterator theNewspaperDistributorIterator = (NewspaperDistributorIterator)findAncestorWithClass(this, NewspaperDistributorIterator.class);
			pageContext.getOut().print(theNewspaperDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for distributor tag ");
		}
		return SKIP_BODY;
	}
}

