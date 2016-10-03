package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultySuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultySuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultySuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultySuffixNameIterator theEmeritusFaculty = (EmeritusFacultySuffixNameIterator)findAncestorWithClass(this, EmeritusFacultySuffixNameIterator.class);
			pageContext.getOut().print(theEmeritusFaculty.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

