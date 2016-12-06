package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyCodeGAULIterator theGovernmentAgency = (GovernmentAgencyCodeGAULIterator)findAncestorWithClass(this, GovernmentAgencyCodeGAULIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

