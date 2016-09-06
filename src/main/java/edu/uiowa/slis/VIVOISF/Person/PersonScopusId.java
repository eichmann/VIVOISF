package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonScopusId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonScopusId currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonScopusId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonScopusIdIterator thePerson = (PersonScopusIdIterator)findAncestorWithClass(this, PersonScopusIdIterator.class);
			pageContext.getOut().print(thePerson.getScopusId());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for scopusId tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for scopusId tag ");
		}
		return SKIP_BODY;
	}
}

