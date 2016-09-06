package edu.uiowa.slis.VIVOISF.SeminarSeries;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeminarSeriesSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeminarSeriesSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(SeminarSeriesSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			SeminarSeries theSeminarSeries = (SeminarSeries)findAncestorWithClass(this, SeminarSeries.class);
			if (!theSeminarSeries.commitNeeded) {
				pageContext.getOut().print(theSeminarSeries.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing SeminarSeries for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing SeminarSeries for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			SeminarSeries theSeminarSeries = (SeminarSeries)findAncestorWithClass(this, SeminarSeries.class);
			return theSeminarSeries.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing SeminarSeries for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing SeminarSeries for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			SeminarSeries theSeminarSeries = (SeminarSeries)findAncestorWithClass(this, SeminarSeries.class);
			theSeminarSeries.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing SeminarSeries for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing SeminarSeries for subjectURI tag ");
		}
	}
}

