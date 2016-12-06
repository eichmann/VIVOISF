package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyHasMaxLatitudeIterator theGovernmentAgency = (GovernmentAgencyHasMaxLatitudeIterator)findAncestorWithClass(this, GovernmentAgencyHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

