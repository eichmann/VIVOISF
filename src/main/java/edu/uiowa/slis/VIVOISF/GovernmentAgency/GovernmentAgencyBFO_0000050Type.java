package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyBFO_0000050Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyBFO_0000050Type currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyBFO_0000050Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyBFO_0000050Iterator theGovernmentAgencyBFO_0000050Iterator = (GovernmentAgencyBFO_0000050Iterator)findAncestorWithClass(this, GovernmentAgencyBFO_0000050Iterator.class);
			pageContext.getOut().print(theGovernmentAgencyBFO_0000050Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

