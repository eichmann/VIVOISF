package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyOwnerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyOwnerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyOwnerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyOwnerInverseIterator theGovernmentAgencyOwnerInverseIterator = (GovernmentAgencyOwnerInverseIterator)findAncestorWithClass(this, GovernmentAgencyOwnerInverseIterator.class);
			pageContext.getOut().print(theGovernmentAgencyOwnerInverseIterator.getOwnerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for owner tag ");
		}
		return SKIP_BODY;
	}
}

