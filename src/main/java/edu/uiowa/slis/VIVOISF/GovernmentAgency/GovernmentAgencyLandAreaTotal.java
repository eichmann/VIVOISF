package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyLandAreaTotalIterator theGovernmentAgency = (GovernmentAgencyLandAreaTotalIterator)findAncestorWithClass(this, GovernmentAgencyLandAreaTotalIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

