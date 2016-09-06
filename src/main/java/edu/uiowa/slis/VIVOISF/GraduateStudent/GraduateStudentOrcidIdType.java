package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentOrcidIdType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentOrcidIdType currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentOrcidIdType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentOrcidIdIterator theGraduateStudentOrcidIdIterator = (GraduateStudentOrcidIdIterator)findAncestorWithClass(this, GraduateStudentOrcidIdIterator.class);
			pageContext.getOut().print(theGraduateStudentOrcidIdIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for orcidId tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for orcidId tag ");
		}
		return SKIP_BODY;
	}
}

