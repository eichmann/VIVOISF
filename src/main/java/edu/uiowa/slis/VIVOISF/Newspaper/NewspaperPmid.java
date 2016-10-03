package edu.uiowa.slis.VIVOISF.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewspaperPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewspaperPmidIterator theNewspaper = (NewspaperPmidIterator)findAncestorWithClass(this, NewspaperPmidIterator.class);
			pageContext.getOut().print(theNewspaper.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for pmid tag ");
		}
		return SKIP_BODY;
	}
}

