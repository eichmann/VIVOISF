package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyERO_0000397Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyERO_0000397Type currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyERO_0000397Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultyERO_0000397Iterator theEmeritusFacultyERO_0000397Iterator = (EmeritusFacultyERO_0000397Iterator)findAncestorWithClass(this, EmeritusFacultyERO_0000397Iterator.class);
			pageContext.getOut().print(theEmeritusFacultyERO_0000397Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for ERO_0000397 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for ERO_0000397 tag ");
		}
		return SKIP_BODY;
	}
}

