package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicRO_0000053 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicRO_0000053 currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicRO_0000053.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicRO_0000053Iterator theNonAcademicRO_0000053Iterator = (NonAcademicRO_0000053Iterator)findAncestorWithClass(this, NonAcademicRO_0000053Iterator.class);
			pageContext.getOut().print(theNonAcademicRO_0000053Iterator.getRO_0000053());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

