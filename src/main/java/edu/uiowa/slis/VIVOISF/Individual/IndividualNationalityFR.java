package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualNationalityFRIterator theIndividual = (IndividualNationalityFRIterator)findAncestorWithClass(this, IndividualNationalityFRIterator.class);
			pageContext.getOut().print(theIndividual.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

