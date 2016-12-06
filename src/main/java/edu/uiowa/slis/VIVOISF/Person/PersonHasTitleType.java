package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonHasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonHasTitleIterator thePersonHasTitleIterator = (PersonHasTitleIterator)findAncestorWithClass(this, PersonHasTitleIterator.class);
			pageContext.getOut().print(thePersonHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}
