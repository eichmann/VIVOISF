package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyResearcherId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyResearcherId currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyResearcherId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultyResearcherIdIterator theEmeritusFaculty = (EmeritusFacultyResearcherIdIterator)findAncestorWithClass(this, EmeritusFacultyResearcherIdIterator.class);
			pageContext.getOut().print(theEmeritusFaculty.getResearcherId());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for researcherId tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for researcherId tag ");
		}
		return SKIP_BODY;
	}
}

