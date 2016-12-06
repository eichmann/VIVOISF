package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualLandAreaUnitIterator theIndividual = (IndividualLandAreaUnitIterator)findAncestorWithClass(this, IndividualLandAreaUnitIterator.class);
			pageContext.getOut().print(theIndividual.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

