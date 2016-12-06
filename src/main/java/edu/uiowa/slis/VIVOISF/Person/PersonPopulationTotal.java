package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonPopulationTotalIterator thePerson = (PersonPopulationTotalIterator)findAncestorWithClass(this, PersonPopulationTotalIterator.class);
			pageContext.getOut().print(thePerson.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

