package edu.uiowa.slis.VIVOISF.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewspaperCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewspaperCodenIterator theNewspaper = (NewspaperCodenIterator)findAncestorWithClass(this, NewspaperCodenIterator.class);
			pageContext.getOut().print(theNewspaper.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for coden tag ");
		}
		return SKIP_BODY;
	}
}

