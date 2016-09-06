package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultyGeographicFocusIterator theEmeritusFacultyGeographicFocusIterator = (EmeritusFacultyGeographicFocusIterator)findAncestorWithClass(this, EmeritusFacultyGeographicFocusIterator.class);
			pageContext.getOut().print(theEmeritusFacultyGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

