package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyScopusId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyScopusId currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyScopusId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultyScopusIdIterator theEmeritusFaculty = (EmeritusFacultyScopusIdIterator)findAncestorWithClass(this, EmeritusFacultyScopusIdIterator.class);
			pageContext.getOut().print(theEmeritusFaculty.getScopusId());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for scopusId tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for scopusId tag ");
		}
		return SKIP_BODY;
	}
}

