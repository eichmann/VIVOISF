package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonNameOfficialENIterator thePerson = (PersonNameOfficialENIterator)findAncestorWithClass(this, PersonNameOfficialENIterator.class);
			pageContext.getOut().print(thePerson.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

