package edu.uiowa.slis.VIVOISF.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewspaperUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewspaperUpcIterator theNewspaper = (NewspaperUpcIterator)findAncestorWithClass(this, NewspaperUpcIterator.class);
			pageContext.getOut().print(theNewspaper.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for upc tag ");
		}
		return SKIP_BODY;
	}
}

