package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicProducerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicProducerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicProducerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicProducerInverseIterator theNonFacultyAcademicProducerInverseIterator = (NonFacultyAcademicProducerInverseIterator)findAncestorWithClass(this, NonFacultyAcademicProducerInverseIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicProducerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for producer tag ");
		}
		return SKIP_BODY;
	}
}

