package edu.uiowa.slis.VIVOISF.Class;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClassDevelop_comment extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClassDevelop_comment currentInstance = null;
	private static final Log log = LogFactory.getLog(ClassDevelop_comment.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClassDevelop_commentIterator theClass = (ClassDevelop_commentIterator)findAncestorWithClass(this, ClassDevelop_commentIterator.class);
			pageContext.getOut().print(theClass.getDevelop_comment());
		} catch (Exception e) {
			log.error("Can't find enclosing Class for develop_comment tag ", e);
			throw new JspTagException("Error: Can't find enclosing Class for develop_comment tag ");
		}
		return SKIP_BODY;
	}
}

