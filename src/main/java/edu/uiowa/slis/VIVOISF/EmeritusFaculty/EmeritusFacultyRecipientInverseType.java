package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyRecipientInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyRecipientInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyRecipientInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultyRecipientInverseIterator theEmeritusFacultyRecipientInverseIterator = (EmeritusFacultyRecipientInverseIterator)findAncestorWithClass(this, EmeritusFacultyRecipientInverseIterator.class);
			pageContext.getOut().print(theEmeritusFacultyRecipientInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for recipient tag ");
		}
		return SKIP_BODY;
	}
}

