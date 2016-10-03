package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegePerformerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegePerformerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegePerformerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollegePerformerInverseIterator theCollegePerformerInverseIterator = (CollegePerformerInverseIterator)findAncestorWithClass(this, CollegePerformerInverseIterator.class);
			pageContext.getOut().print(theCollegePerformerInverseIterator.getPerformerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing College for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for performer tag ");
		}
		return SKIP_BODY;
	}
}

