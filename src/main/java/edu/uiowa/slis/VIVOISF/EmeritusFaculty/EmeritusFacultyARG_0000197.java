package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyARG_0000197 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyARG_0000197 currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyARG_0000197.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultyARG_0000197Iterator theEmeritusFaculty = (EmeritusFacultyARG_0000197Iterator)findAncestorWithClass(this, EmeritusFacultyARG_0000197Iterator.class);
			pageContext.getOut().print(theEmeritusFaculty.getARG_0000197());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for ARG_0000197 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for ARG_0000197 tag ");
		}
		return SKIP_BODY;
	}
}

