package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionAgriculturalAreaYearIterator thePostdocPosition = (PostdocPositionAgriculturalAreaYearIterator)findAncestorWithClass(this, PostdocPositionAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(thePostdocPosition.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

