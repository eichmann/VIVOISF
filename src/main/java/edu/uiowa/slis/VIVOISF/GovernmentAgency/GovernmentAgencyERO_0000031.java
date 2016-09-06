package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyERO_0000031 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyERO_0000031 currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyERO_0000031.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyERO_0000031Iterator theGovernmentAgencyERO_0000031Iterator = (GovernmentAgencyERO_0000031Iterator)findAncestorWithClass(this, GovernmentAgencyERO_0000031Iterator.class);
			pageContext.getOut().print(theGovernmentAgencyERO_0000031Iterator.getERO_0000031());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for ERO_0000031 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for ERO_0000031 tag ");
		}
		return SKIP_BODY;
	}
}

