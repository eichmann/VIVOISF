package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyGDPUnitIterator theGovernmentAgency = (GovernmentAgencyGDPUnitIterator)findAncestorWithClass(this, GovernmentAgencyGDPUnitIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

