package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicProducerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicProducerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicProducerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicProducerInverseIterator theNonFacultyAcademicProducerInverseIterator = (NonFacultyAcademicProducerInverseIterator)findAncestorWithClass(this, NonFacultyAcademicProducerInverseIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicProducerInverseIterator.getProducerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for producer tag ");
		}
		return SKIP_BODY;
	}
}

