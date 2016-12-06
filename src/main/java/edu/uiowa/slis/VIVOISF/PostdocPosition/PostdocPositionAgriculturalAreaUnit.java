package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionAgriculturalAreaUnitIterator thePostdocPosition = (PostdocPositionAgriculturalAreaUnitIterator)findAncestorWithClass(this, PostdocPositionAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(thePostdocPosition.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

