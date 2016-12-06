package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualAgriculturalAreaTotalIterator theIndividual = (IndividualAgriculturalAreaTotalIterator)findAncestorWithClass(this, IndividualAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theIndividual.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

