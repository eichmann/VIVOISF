package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusFaculty theEmeritusFaculty = (EmeritusFaculty)findAncestorWithClass(this, EmeritusFaculty.class);
			if (!theEmeritusFaculty.commitNeeded) {
				pageContext.getOut().print(theEmeritusFaculty.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			EmeritusFaculty theEmeritusFaculty = (EmeritusFaculty)findAncestorWithClass(this, EmeritusFaculty.class);
			return theEmeritusFaculty.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing EmeritusFaculty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			EmeritusFaculty theEmeritusFaculty = (EmeritusFaculty)findAncestorWithClass(this, EmeritusFaculty.class);
			theEmeritusFaculty.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for label tag ");
		}
	}
}

