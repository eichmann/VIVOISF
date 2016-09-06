package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyOrcidId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyOrcidId currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyOrcidId.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultyOrcidIdIterator theEmeritusFacultyOrcidIdIterator = (EmeritusFacultyOrcidIdIterator)findAncestorWithClass(this, EmeritusFacultyOrcidIdIterator.class);
			pageContext.getOut().print(theEmeritusFacultyOrcidIdIterator.getOrcidId());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for orcidId tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for orcidId tag ");
		}
		return SKIP_BODY;
	}
}

