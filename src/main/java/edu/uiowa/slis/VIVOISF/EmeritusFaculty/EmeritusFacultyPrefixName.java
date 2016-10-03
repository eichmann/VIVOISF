package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultyPrefixNameIterator theEmeritusFaculty = (EmeritusFacultyPrefixNameIterator)findAncestorWithClass(this, EmeritusFacultyPrefixNameIterator.class);
			pageContext.getOut().print(theEmeritusFaculty.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

