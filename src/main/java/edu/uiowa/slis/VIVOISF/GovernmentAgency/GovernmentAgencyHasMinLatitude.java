package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyHasMinLatitudeIterator theGovernmentAgency = (GovernmentAgencyHasMinLatitudeIterator)findAncestorWithClass(this, GovernmentAgencyHasMinLatitudeIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

