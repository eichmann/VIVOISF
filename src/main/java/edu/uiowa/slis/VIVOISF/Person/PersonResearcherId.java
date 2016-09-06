package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonResearcherId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonResearcherId currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonResearcherId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonResearcherIdIterator thePerson = (PersonResearcherIdIterator)findAncestorWithClass(this, PersonResearcherIdIterator.class);
			pageContext.getOut().print(thePerson.getResearcherId());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for researcherId tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for researcherId tag ");
		}
		return SKIP_BODY;
	}
}

