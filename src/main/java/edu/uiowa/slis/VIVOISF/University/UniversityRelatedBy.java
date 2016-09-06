package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UniversityRelatedByIterator theUniversityRelatedByIterator = (UniversityRelatedByIterator)findAncestorWithClass(this, UniversityRelatedByIterator.class);
			pageContext.getOut().print(theUniversityRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing University for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

