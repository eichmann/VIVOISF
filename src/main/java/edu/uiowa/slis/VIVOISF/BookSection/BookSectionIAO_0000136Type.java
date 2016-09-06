package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionIAO_0000136Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionIAO_0000136Type currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionIAO_0000136Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionIAO_0000136Iterator theBookSectionIAO_0000136Iterator = (BookSectionIAO_0000136Iterator)findAncestorWithClass(this, BookSectionIAO_0000136Iterator.class);
			pageContext.getOut().print(theBookSectionIAO_0000136Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

