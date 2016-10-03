package edu.uiowa.slis.VIVOISF.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewspaperIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewspaperIsbn10Iterator theNewspaper = (NewspaperIsbn10Iterator)findAncestorWithClass(this, NewspaperIsbn10Iterator.class);
			pageContext.getOut().print(theNewspaper.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

