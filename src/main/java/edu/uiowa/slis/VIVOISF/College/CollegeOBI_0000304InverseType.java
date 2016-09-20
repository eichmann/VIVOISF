package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeOBI_0000304InverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeOBI_0000304InverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeOBI_0000304InverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollegeOBI_0000304InverseIterator theCollegeOBI_0000304InverseIterator = (CollegeOBI_0000304InverseIterator)findAncestorWithClass(this, CollegeOBI_0000304InverseIterator.class);
			pageContext.getOut().print(theCollegeOBI_0000304InverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing College for OBI_0000304 tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for OBI_0000304 tag ");
		}
		return SKIP_BODY;
	}
}

