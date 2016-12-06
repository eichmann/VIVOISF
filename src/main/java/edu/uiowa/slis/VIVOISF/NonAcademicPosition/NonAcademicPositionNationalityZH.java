package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionNationalityZHIterator theNonAcademicPosition = (NonAcademicPositionNationalityZHIterator)findAncestorWithClass(this, NonAcademicPositionNationalityZHIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

