package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonOrcidId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonOrcidId currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonOrcidId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonOrcidIdIterator thePerson = (PersonOrcidIdIterator)findAncestorWithClass(this, PersonOrcidIdIterator.class);
			pageContext.getOut().print(thePerson.getOrcidId());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for orcidId tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for orcidId tag ");
		}
		return SKIP_BODY;
	}
}

