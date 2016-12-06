package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualNationalityESIterator theIndividual = (IndividualNationalityESIterator)findAncestorWithClass(this, IndividualNationalityESIterator.class);
			pageContext.getOut().print(theIndividual.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

