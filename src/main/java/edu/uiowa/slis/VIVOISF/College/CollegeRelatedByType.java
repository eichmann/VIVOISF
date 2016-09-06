package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollegeRelatedByIterator theCollegeRelatedByIterator = (CollegeRelatedByIterator)findAncestorWithClass(this, CollegeRelatedByIterator.class);
			pageContext.getOut().print(theCollegeRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing College for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

