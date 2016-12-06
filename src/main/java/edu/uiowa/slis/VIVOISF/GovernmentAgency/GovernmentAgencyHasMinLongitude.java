package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyHasMinLongitudeIterator theGovernmentAgency = (GovernmentAgencyHasMinLongitudeIterator)findAncestorWithClass(this, GovernmentAgencyHasMinLongitudeIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

