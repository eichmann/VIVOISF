package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonPopulationUnitIterator thePerson = (PersonPopulationUnitIterator)findAncestorWithClass(this, PersonPopulationUnitIterator.class);
			pageContext.getOut().print(thePerson.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

