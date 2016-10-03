package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyEditorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyEditorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyEditorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultyEditorInverseIterator theEmeritusFacultyEditorInverseIterator = (EmeritusFacultyEditorInverseIterator)findAncestorWithClass(this, EmeritusFacultyEditorInverseIterator.class);
			pageContext.getOut().print(theEmeritusFacultyEditorInverseIterator.getEditorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for editor tag ");
		}
		return SKIP_BODY;
	}
}

