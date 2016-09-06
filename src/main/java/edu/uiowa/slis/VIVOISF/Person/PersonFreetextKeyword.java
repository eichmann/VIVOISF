package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonFreetextKeywordIterator thePerson = (PersonFreetextKeywordIterator)findAncestorWithClass(this, PersonFreetextKeywordIterator.class);
			pageContext.getOut().print(thePerson.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

