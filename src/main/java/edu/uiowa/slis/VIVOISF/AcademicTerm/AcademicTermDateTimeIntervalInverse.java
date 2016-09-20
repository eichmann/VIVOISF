package edu.uiowa.slis.VIVOISF.AcademicTerm;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicTermDateTimeIntervalInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicTermDateTimeIntervalInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicTermDateTimeIntervalInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicTermDateTimeIntervalInverseIterator theAcademicTermDateTimeIntervalInverseIterator = (AcademicTermDateTimeIntervalInverseIterator)findAncestorWithClass(this, AcademicTermDateTimeIntervalInverseIterator.class);
			pageContext.getOut().print(theAcademicTermDateTimeIntervalInverseIterator.getDateTimeIntervalInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicTerm for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicTerm for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}
