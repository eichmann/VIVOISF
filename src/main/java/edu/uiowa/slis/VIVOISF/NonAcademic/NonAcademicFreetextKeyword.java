package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicFreetextKeywordIterator theNonAcademic = (NonAcademicFreetextKeywordIterator)findAncestorWithClass(this, NonAcademicFreetextKeywordIterator.class);
			pageContext.getOut().print(theNonAcademic.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

