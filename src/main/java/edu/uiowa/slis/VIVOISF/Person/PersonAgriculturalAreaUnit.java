package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonAgriculturalAreaUnitIterator thePerson = (PersonAgriculturalAreaUnitIterator)findAncestorWithClass(this, PersonAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(thePerson.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

