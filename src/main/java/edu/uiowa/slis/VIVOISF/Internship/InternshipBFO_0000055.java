package edu.uiowa.slis.VIVOISF.Internship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InternshipBFO_0000055 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InternshipBFO_0000055 currentInstance = null;
	private static final Log log = LogFactory.getLog(InternshipBFO_0000055.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InternshipBFO_0000055Iterator theInternshipBFO_0000055Iterator = (InternshipBFO_0000055Iterator)findAncestorWithClass(this, InternshipBFO_0000055Iterator.class);
			pageContext.getOut().print(theInternshipBFO_0000055Iterator.getBFO_0000055());
		} catch (Exception e) {
			log.error("Can't find enclosing Internship for BFO_0000055 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Internship for BFO_0000055 tag ");
		}
		return SKIP_BODY;
	}
}

