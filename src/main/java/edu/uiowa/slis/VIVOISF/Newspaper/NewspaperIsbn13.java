package edu.uiowa.slis.VIVOISF.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewspaperIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewspaperIsbn13Iterator theNewspaper = (NewspaperIsbn13Iterator)findAncestorWithClass(this, NewspaperIsbn13Iterator.class);
			pageContext.getOut().print(theNewspaper.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

