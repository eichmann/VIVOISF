package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScreenplayAuthorListIterator theScreenplayAuthorListIterator = (ScreenplayAuthorListIterator)findAncestorWithClass(this, ScreenplayAuthorListIterator.class);
			pageContext.getOut().print(theScreenplayAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for authorList tag ");
		}
		return SKIP_BODY;
	}
}

