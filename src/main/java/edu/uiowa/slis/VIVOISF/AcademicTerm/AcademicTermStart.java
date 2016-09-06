package edu.uiowa.slis.VIVOISF.AcademicTerm;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicTermStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicTermStart currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicTermStart.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicTermStartIterator theAcademicTermStartIterator = (AcademicTermStartIterator)findAncestorWithClass(this, AcademicTermStartIterator.class);
			pageContext.getOut().print(theAcademicTermStartIterator.getStart());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicTerm for start tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicTerm for start tag ");
		}
		return SKIP_BODY;
	}
}

