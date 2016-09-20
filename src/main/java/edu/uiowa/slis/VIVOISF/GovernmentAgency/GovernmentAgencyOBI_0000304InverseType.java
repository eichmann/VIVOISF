package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyOBI_0000304InverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyOBI_0000304InverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyOBI_0000304InverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyOBI_0000304InverseIterator theGovernmentAgencyOBI_0000304InverseIterator = (GovernmentAgencyOBI_0000304InverseIterator)findAncestorWithClass(this, GovernmentAgencyOBI_0000304InverseIterator.class);
			pageContext.getOut().print(theGovernmentAgencyOBI_0000304InverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for OBI_0000304 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for OBI_0000304 tag ");
		}
		return SKIP_BODY;
	}
}

