package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualNationalityITIterator theIndividual = (IndividualNationalityITIterator)findAncestorWithClass(this, IndividualNationalityITIterator.class);
			pageContext.getOut().print(theIndividual.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

