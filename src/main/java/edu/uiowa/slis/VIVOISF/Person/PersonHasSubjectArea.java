package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonHasSubjectArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonHasSubjectArea currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonHasSubjectArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonHasSubjectAreaIterator thePersonHasSubjectAreaIterator = (PersonHasSubjectAreaIterator)findAncestorWithClass(this, PersonHasSubjectAreaIterator.class);
			pageContext.getOut().print(thePersonHasSubjectAreaIterator.getHasSubjectArea());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

