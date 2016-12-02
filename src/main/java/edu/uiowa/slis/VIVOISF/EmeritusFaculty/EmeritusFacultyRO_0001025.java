package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyRO_0001025 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyRO_0001025 currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyRO_0001025.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultyRO_0001025Iterator theEmeritusFaculty = (EmeritusFacultyRO_0001025Iterator)findAncestorWithClass(this, EmeritusFacultyRO_0001025Iterator.class);
			pageContext.getOut().print(theEmeritusFaculty.getRO_0001025());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

