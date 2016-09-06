package edu.uiowa.slis.VIVOISF.Performance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PerformanceSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PerformanceSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(PerformanceSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Performance thePerformance = (Performance)findAncestorWithClass(this, Performance.class);
			if (!thePerformance.commitNeeded) {
				pageContext.getOut().print(thePerformance.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Performance for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Performance for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Performance thePerformance = (Performance)findAncestorWithClass(this, Performance.class);
			return thePerformance.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Performance for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Performance for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Performance thePerformance = (Performance)findAncestorWithClass(this, Performance.class);
			thePerformance.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Performance for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Performance for subjectURI tag ");
		}
	}
}

