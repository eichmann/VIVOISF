package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisAuthorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisAuthorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisAuthorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisAuthorListIterator theThesisAuthorListIterator = (ThesisAuthorListIterator)findAncestorWithClass(this, ThesisAuthorListIterator.class);
			pageContext.getOut().print(theThesisAuthorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for authorList tag ");
		}
		return SKIP_BODY;
	}
}

