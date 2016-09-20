package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicERO_0000397Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicERO_0000397Type currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicERO_0000397Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicERO_0000397Iterator theNonAcademicERO_0000397Iterator = (NonAcademicERO_0000397Iterator)findAncestorWithClass(this, NonAcademicERO_0000397Iterator.class);
			pageContext.getOut().print(theNonAcademicERO_0000397Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for ERO_0000397 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for ERO_0000397 tag ");
		}
		return SKIP_BODY;
	}
}

