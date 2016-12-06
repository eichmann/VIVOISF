package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionRO_0002234Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionRO_0002234Type currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionRO_0002234Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionRO_0002234Iterator theBookSectionRO_0002234Iterator = (BookSectionRO_0002234Iterator)findAncestorWithClass(this, BookSectionRO_0002234Iterator.class);
			pageContext.getOut().print(theBookSectionRO_0002234Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

