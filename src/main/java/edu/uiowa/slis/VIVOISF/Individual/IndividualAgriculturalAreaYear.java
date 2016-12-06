package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualAgriculturalAreaYearIterator theIndividual = (IndividualAgriculturalAreaYearIterator)findAncestorWithClass(this, IndividualAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theIndividual.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}
