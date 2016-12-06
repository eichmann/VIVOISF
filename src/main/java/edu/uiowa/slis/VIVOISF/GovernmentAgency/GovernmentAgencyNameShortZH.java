package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyNameShortZHIterator theGovernmentAgency = (GovernmentAgencyNameShortZHIterator)findAncestorWithClass(this, GovernmentAgencyNameShortZHIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

