package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualBirthdate extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualBirthdate currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualBirthdate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualBirthdateIterator theIndividual = (IndividualBirthdateIterator)findAncestorWithClass(this, IndividualBirthdateIterator.class);
			pageContext.getOut().print(theIndividual.getBirthdate());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for birthdate tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for birthdate tag ");
		}
		return SKIP_BODY;
	}
}

