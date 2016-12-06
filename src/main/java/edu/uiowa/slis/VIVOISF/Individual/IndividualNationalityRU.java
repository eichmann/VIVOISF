package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualNationalityRUIterator theIndividual = (IndividualNationalityRUIterator)findAncestorWithClass(this, IndividualNationalityRUIterator.class);
			pageContext.getOut().print(theIndividual.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

