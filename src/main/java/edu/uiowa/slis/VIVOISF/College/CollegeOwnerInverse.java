package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeOwnerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeOwnerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeOwnerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollegeOwnerInverseIterator theCollegeOwnerInverseIterator = (CollegeOwnerInverseIterator)findAncestorWithClass(this, CollegeOwnerInverseIterator.class);
			pageContext.getOut().print(theCollegeOwnerInverseIterator.getOwnerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing College for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for owner tag ");
		}
		return SKIP_BODY;
	}
}

