package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyAgriculturalAreaTotalIterator theGovernmentAgency = (GovernmentAgencyAgriculturalAreaTotalIterator)findAncestorWithClass(this, GovernmentAgencyAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

