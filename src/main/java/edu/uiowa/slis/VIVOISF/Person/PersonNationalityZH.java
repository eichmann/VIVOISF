package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonNationalityZHIterator thePerson = (PersonNationalityZHIterator)findAncestorWithClass(this, PersonNationalityZHIterator.class);
			pageContext.getOut().print(thePerson.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

