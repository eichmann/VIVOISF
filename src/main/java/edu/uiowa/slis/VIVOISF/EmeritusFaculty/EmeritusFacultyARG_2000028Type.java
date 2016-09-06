package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultyARG_2000028Iterator theEmeritusFacultyARG_2000028Iterator = (EmeritusFacultyARG_2000028Iterator)findAncestorWithClass(this, EmeritusFacultyARG_2000028Iterator.class);
			pageContext.getOut().print(theEmeritusFacultyARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

