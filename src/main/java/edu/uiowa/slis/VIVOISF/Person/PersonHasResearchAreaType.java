package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonHasResearchAreaIterator thePersonHasResearchAreaIterator = (PersonHasResearchAreaIterator)findAncestorWithClass(this, PersonHasResearchAreaIterator.class);
			pageContext.getOut().print(thePersonHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

