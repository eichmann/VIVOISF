package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicARG_0000172 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicARG_0000172 currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicARG_0000172.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicARG_0000172Iterator theNonAcademic = (NonAcademicARG_0000172Iterator)findAncestorWithClass(this, NonAcademicARG_0000172Iterator.class);
			pageContext.getOut().print(theNonAcademic.getARG_0000172());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for ARG_0000172 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for ARG_0000172 tag ");
		}
		return SKIP_BODY;
	}
}

