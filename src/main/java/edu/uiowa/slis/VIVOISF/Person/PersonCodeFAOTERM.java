package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonCodeFAOTERMIterator thePerson = (PersonCodeFAOTERMIterator)findAncestorWithClass(this, PersonCodeFAOTERMIterator.class);
			pageContext.getOut().print(thePerson.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

