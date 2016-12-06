package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualAgriculturalAreaUnitIterator theIndividual = (IndividualAgriculturalAreaUnitIterator)findAncestorWithClass(this, IndividualAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theIndividual.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

