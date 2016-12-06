package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyRO_0002353Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyRO_0002353Type currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyRO_0002353Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyRO_0002353Iterator theGovernmentAgencyRO_0002353Iterator = (GovernmentAgencyRO_0002353Iterator)findAncestorWithClass(this, GovernmentAgencyRO_0002353Iterator.class);
			pageContext.getOut().print(theGovernmentAgencyRO_0002353Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

