package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyERO_0000037Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyERO_0000037Type currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyERO_0000037Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyERO_0000037Iterator theGovernmentAgencyERO_0000037Iterator = (GovernmentAgencyERO_0000037Iterator)findAncestorWithClass(this, GovernmentAgencyERO_0000037Iterator.class);
			pageContext.getOut().print(theGovernmentAgencyERO_0000037Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for ERO_0000037 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for ERO_0000037 tag ");
		}
		return SKIP_BODY;
	}
}

