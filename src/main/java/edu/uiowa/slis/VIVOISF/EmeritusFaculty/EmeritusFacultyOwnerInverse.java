package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyOwnerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyOwnerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyOwnerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultyOwnerInverseIterator theEmeritusFacultyOwnerInverseIterator = (EmeritusFacultyOwnerInverseIterator)findAncestorWithClass(this, EmeritusFacultyOwnerInverseIterator.class);
			pageContext.getOut().print(theEmeritusFacultyOwnerInverseIterator.getOwnerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for owner tag ");
		}
		return SKIP_BODY;
	}
}

