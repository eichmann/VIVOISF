package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyHasSubjectArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyHasSubjectArea currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyHasSubjectArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyHasSubjectAreaIterator theGovernmentAgencyHasSubjectAreaIterator = (GovernmentAgencyHasSubjectAreaIterator)findAncestorWithClass(this, GovernmentAgencyHasSubjectAreaIterator.class);
			pageContext.getOut().print(theGovernmentAgencyHasSubjectAreaIterator.getHasSubjectArea());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

