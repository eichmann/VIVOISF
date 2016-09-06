package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyERO_0000033 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyERO_0000033 currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyERO_0000033.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultyERO_0000033Iterator theEmeritusFacultyERO_0000033Iterator = (EmeritusFacultyERO_0000033Iterator)findAncestorWithClass(this, EmeritusFacultyERO_0000033Iterator.class);
			pageContext.getOut().print(theEmeritusFacultyERO_0000033Iterator.getERO_0000033());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for ERO_0000033 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for ERO_0000033 tag ");
		}
		return SKIP_BODY;
	}
}

