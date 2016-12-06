package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyHDITotalIterator theGovernmentAgency = (GovernmentAgencyHDITotalIterator)findAncestorWithClass(this, GovernmentAgencyHDITotalIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

