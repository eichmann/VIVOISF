package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultySameAs extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultySameAs currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultySameAs.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultySameAsIterator theEmeritusFaculty = (EmeritusFacultySameAsIterator)findAncestorWithClass(this, EmeritusFacultySameAsIterator.class);
			pageContext.getOut().print(theEmeritusFaculty.getSameAs());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

