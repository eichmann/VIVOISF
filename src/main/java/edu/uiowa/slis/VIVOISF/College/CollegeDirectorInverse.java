package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeDirectorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeDirectorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeDirectorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollegeDirectorInverseIterator theCollegeDirectorInverseIterator = (CollegeDirectorInverseIterator)findAncestorWithClass(this, CollegeDirectorInverseIterator.class);
			pageContext.getOut().print(theCollegeDirectorInverseIterator.getDirectorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing College for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for director tag ");
		}
		return SKIP_BODY;
	}
}

