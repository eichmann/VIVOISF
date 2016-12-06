package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyCodeDBPediaIDIterator theGovernmentAgency = (GovernmentAgencyCodeDBPediaIDIterator)findAncestorWithClass(this, GovernmentAgencyCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

