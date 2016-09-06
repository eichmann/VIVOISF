package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyERACommonsId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyERACommonsId currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyERACommonsId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultyERACommonsIdIterator theEmeritusFaculty = (EmeritusFacultyERACommonsIdIterator)findAncestorWithClass(this, EmeritusFacultyERACommonsIdIterator.class);
			pageContext.getOut().print(theEmeritusFaculty.getERACommonsId());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for eRACommonsId tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for eRACommonsId tag ");
		}
		return SKIP_BODY;
	}
}

