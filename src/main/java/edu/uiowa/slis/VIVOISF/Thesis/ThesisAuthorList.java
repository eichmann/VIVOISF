package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisAuthorListIterator theThesisAuthorListIterator = (ThesisAuthorListIterator)findAncestorWithClass(this, ThesisAuthorListIterator.class);
			pageContext.getOut().print(theThesisAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for authorList tag ");
		}
		return SKIP_BODY;
	}
}

