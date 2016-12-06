package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyHasMaxLongitudeIterator theGovernmentAgency = (GovernmentAgencyHasMaxLongitudeIterator)findAncestorWithClass(this, GovernmentAgencyHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

