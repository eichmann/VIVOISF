package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonCodeDBPediaIDIterator thePerson = (PersonCodeDBPediaIDIterator)findAncestorWithClass(this, PersonCodeDBPediaIDIterator.class);
			pageContext.getOut().print(thePerson.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

