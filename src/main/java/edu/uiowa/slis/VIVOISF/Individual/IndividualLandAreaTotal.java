package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualLandAreaTotalIterator theIndividual = (IndividualLandAreaTotalIterator)findAncestorWithClass(this, IndividualLandAreaTotalIterator.class);
			pageContext.getOut().print(theIndividual.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

