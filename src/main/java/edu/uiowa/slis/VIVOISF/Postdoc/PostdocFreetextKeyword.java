package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocFreetextKeywordIterator thePostdoc = (PostdocFreetextKeywordIterator)findAncestorWithClass(this, PostdocFreetextKeywordIterator.class);
			pageContext.getOut().print(thePostdoc.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

