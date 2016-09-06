package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonOrcidIdType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonOrcidIdType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonOrcidIdType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonOrcidIdIterator thePersonOrcidIdIterator = (PersonOrcidIdIterator)findAncestorWithClass(this, PersonOrcidIdIterator.class);
			pageContext.getOut().print(thePersonOrcidIdIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for orcidId tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for orcidId tag ");
		}
		return SKIP_BODY;
	}
}

