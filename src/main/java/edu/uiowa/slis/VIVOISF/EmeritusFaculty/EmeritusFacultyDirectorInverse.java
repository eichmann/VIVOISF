package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyDirectorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyDirectorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyDirectorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultyDirectorInverseIterator theEmeritusFacultyDirectorInverseIterator = (EmeritusFacultyDirectorInverseIterator)findAncestorWithClass(this, EmeritusFacultyDirectorInverseIterator.class);
			pageContext.getOut().print(theEmeritusFacultyDirectorInverseIterator.getDirectorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for director tag ");
		}
		return SKIP_BODY;
	}
}

