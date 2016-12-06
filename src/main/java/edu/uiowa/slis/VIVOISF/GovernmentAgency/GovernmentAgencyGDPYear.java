package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyGDPYearIterator theGovernmentAgency = (GovernmentAgencyGDPYearIterator)findAncestorWithClass(this, GovernmentAgencyGDPYearIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

