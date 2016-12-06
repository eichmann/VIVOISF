package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualNationalityARIterator theIndividual = (IndividualNationalityARIterator)findAncestorWithClass(this, IndividualNationalityARIterator.class);
			pageContext.getOut().print(theIndividual.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

