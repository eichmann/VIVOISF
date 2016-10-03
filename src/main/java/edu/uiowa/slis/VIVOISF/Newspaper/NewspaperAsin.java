package edu.uiowa.slis.VIVOISF.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewspaperAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewspaperAsinIterator theNewspaper = (NewspaperAsinIterator)findAncestorWithClass(this, NewspaperAsinIterator.class);
			pageContext.getOut().print(theNewspaper.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for asin tag ");
		}
		return SKIP_BODY;
	}
}

