package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyRO_0002234Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyRO_0002234Type currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyRO_0002234Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyRO_0002234Iterator theGovernmentAgencyRO_0002234Iterator = (GovernmentAgencyRO_0002234Iterator)findAncestorWithClass(this, GovernmentAgencyRO_0002234Iterator.class);
			pageContext.getOut().print(theGovernmentAgencyRO_0002234Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

