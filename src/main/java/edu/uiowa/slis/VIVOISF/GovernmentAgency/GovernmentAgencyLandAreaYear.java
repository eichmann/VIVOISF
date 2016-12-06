package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyLandAreaYearIterator theGovernmentAgency = (GovernmentAgencyLandAreaYearIterator)findAncestorWithClass(this, GovernmentAgencyLandAreaYearIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

