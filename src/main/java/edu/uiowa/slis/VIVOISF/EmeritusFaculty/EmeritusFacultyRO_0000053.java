package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyRO_0000053 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyRO_0000053 currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyRO_0000053.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultyRO_0000053Iterator theEmeritusFacultyRO_0000053Iterator = (EmeritusFacultyRO_0000053Iterator)findAncestorWithClass(this, EmeritusFacultyRO_0000053Iterator.class);
			pageContext.getOut().print(theEmeritusFacultyRO_0000053Iterator.getRO_0000053());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

