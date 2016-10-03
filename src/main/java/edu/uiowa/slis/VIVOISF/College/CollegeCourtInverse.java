package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeCourtInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeCourtInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeCourtInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollegeCourtInverseIterator theCollegeCourtInverseIterator = (CollegeCourtInverseIterator)findAncestorWithClass(this, CollegeCourtInverseIterator.class);
			pageContext.getOut().print(theCollegeCourtInverseIterator.getCourtInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing College for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for court tag ");
		}
		return SKIP_BODY;
	}
}

