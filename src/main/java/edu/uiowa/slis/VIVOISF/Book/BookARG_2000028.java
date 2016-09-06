package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookARG_2000028 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookARG_2000028 currentInstance = null;
	private static final Log log = LogFactory.getLog(BookARG_2000028.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookARG_2000028Iterator theBookARG_2000028Iterator = (BookARG_2000028Iterator)findAncestorWithClass(this, BookARG_2000028Iterator.class);
			pageContext.getOut().print(theBookARG_2000028Iterator.getARG_2000028());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

