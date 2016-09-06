package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyARG_0000172 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyARG_0000172 currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyARG_0000172.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultyARG_0000172Iterator theEmeritusFaculty = (EmeritusFacultyARG_0000172Iterator)findAncestorWithClass(this, EmeritusFacultyARG_0000172Iterator.class);
			pageContext.getOut().print(theEmeritusFaculty.getARG_0000172());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for ARG_0000172 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for ARG_0000172 tag ");
		}
		return SKIP_BODY;
	}
}

