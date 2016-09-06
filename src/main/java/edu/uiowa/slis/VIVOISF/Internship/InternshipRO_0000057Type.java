package edu.uiowa.slis.VIVOISF.Internship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InternshipRO_0000057Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InternshipRO_0000057Type currentInstance = null;
	private static final Log log = LogFactory.getLog(InternshipRO_0000057Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InternshipRO_0000057Iterator theInternshipRO_0000057Iterator = (InternshipRO_0000057Iterator)findAncestorWithClass(this, InternshipRO_0000057Iterator.class);
			pageContext.getOut().print(theInternshipRO_0000057Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Internship for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Internship for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}

