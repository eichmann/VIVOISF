package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionNationalityFRIterator thePostdocPosition = (PostdocPositionNationalityFRIterator)findAncestorWithClass(this, PostdocPositionNationalityFRIterator.class);
			pageContext.getOut().print(thePostdocPosition.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

