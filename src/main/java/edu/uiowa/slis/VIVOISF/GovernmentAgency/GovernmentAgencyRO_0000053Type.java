package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyRO_0000053Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyRO_0000053Type currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyRO_0000053Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyRO_0000053Iterator theGovernmentAgencyRO_0000053Iterator = (GovernmentAgencyRO_0000053Iterator)findAncestorWithClass(this, GovernmentAgencyRO_0000053Iterator.class);
			pageContext.getOut().print(theGovernmentAgencyRO_0000053Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

