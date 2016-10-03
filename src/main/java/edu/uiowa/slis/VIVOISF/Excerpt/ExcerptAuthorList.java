package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExcerptAuthorListIterator theExcerptAuthorListIterator = (ExcerptAuthorListIterator)findAncestorWithClass(this, ExcerptAuthorListIterator.class);
			pageContext.getOut().print(theExcerptAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for authorList tag ");
		}
		return SKIP_BODY;
	}
}

