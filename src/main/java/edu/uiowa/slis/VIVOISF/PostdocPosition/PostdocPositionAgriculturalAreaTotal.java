package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionAgriculturalAreaTotalIterator thePostdocPosition = (PostdocPositionAgriculturalAreaTotalIterator)findAncestorWithClass(this, PostdocPositionAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(thePostdocPosition.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

