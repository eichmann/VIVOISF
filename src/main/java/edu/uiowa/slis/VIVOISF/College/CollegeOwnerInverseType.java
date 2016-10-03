package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeOwnerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeOwnerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeOwnerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollegeOwnerInverseIterator theCollegeOwnerInverseIterator = (CollegeOwnerInverseIterator)findAncestorWithClass(this, CollegeOwnerInverseIterator.class);
			pageContext.getOut().print(theCollegeOwnerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing College for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for owner tag ");
		}
		return SKIP_BODY;
	}
}

