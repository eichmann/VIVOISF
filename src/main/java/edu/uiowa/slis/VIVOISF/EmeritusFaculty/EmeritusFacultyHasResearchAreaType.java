package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultyHasResearchAreaIterator theEmeritusFacultyHasResearchAreaIterator = (EmeritusFacultyHasResearchAreaIterator)findAncestorWithClass(this, EmeritusFacultyHasResearchAreaIterator.class);
			pageContext.getOut().print(theEmeritusFacultyHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

