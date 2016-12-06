package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyBFO_0000051 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyBFO_0000051 currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyBFO_0000051.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyBFO_0000051Iterator theGovernmentAgencyBFO_0000051Iterator = (GovernmentAgencyBFO_0000051Iterator)findAncestorWithClass(this, GovernmentAgencyBFO_0000051Iterator.class);
			pageContext.getOut().print(theGovernmentAgencyBFO_0000051Iterator.getBFO_0000051());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

