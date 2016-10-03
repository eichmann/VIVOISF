package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyPerformerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyPerformerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyPerformerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultyPerformerInverseIterator theEmeritusFacultyPerformerInverseIterator = (EmeritusFacultyPerformerInverseIterator)findAncestorWithClass(this, EmeritusFacultyPerformerInverseIterator.class);
			pageContext.getOut().print(theEmeritusFacultyPerformerInverseIterator.getPerformerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for performer tag ");
		}
		return SKIP_BODY;
	}
}

