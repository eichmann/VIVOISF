package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionGDPUnitIterator thePostdocPosition = (PostdocPositionGDPUnitIterator)findAncestorWithClass(this, PostdocPositionGDPUnitIterator.class);
			pageContext.getOut().print(thePostdocPosition.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

