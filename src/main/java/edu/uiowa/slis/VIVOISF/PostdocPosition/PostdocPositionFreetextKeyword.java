package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionFreetextKeywordIterator thePostdocPosition = (PostdocPositionFreetextKeywordIterator)findAncestorWithClass(this, PostdocPositionFreetextKeywordIterator.class);
			pageContext.getOut().print(thePostdocPosition.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

