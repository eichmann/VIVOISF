package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyLandAreaUnitIterator theGovernmentAgency = (GovernmentAgencyLandAreaUnitIterator)findAncestorWithClass(this, GovernmentAgencyLandAreaUnitIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

