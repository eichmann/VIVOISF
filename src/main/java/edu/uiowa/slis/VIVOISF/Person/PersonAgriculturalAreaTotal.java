package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonAgriculturalAreaTotalIterator thePerson = (PersonAgriculturalAreaTotalIterator)findAncestorWithClass(this, PersonAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(thePerson.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

