package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyARG_2000028Iterator theGovernmentAgencyARG_2000028Iterator = (GovernmentAgencyARG_2000028Iterator)findAncestorWithClass(this, GovernmentAgencyARG_2000028Iterator.class);
			pageContext.getOut().print(theGovernmentAgencyARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

