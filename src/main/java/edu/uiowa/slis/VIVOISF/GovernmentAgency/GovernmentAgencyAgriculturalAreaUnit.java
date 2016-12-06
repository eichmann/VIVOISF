package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyAgriculturalAreaUnitIterator theGovernmentAgency = (GovernmentAgencyAgriculturalAreaUnitIterator)findAncestorWithClass(this, GovernmentAgencyAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

