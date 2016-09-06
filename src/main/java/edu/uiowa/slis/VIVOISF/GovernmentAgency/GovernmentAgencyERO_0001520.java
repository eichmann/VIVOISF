package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyERO_0001520 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyERO_0001520 currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyERO_0001520.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyERO_0001520Iterator theGovernmentAgencyERO_0001520Iterator = (GovernmentAgencyERO_0001520Iterator)findAncestorWithClass(this, GovernmentAgencyERO_0001520Iterator.class);
			pageContext.getOut().print(theGovernmentAgencyERO_0001520Iterator.getERO_0001520());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for ERO_0001520 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for ERO_0001520 tag ");
		}
		return SKIP_BODY;
	}
}

