package edu.uiowa.slis.VIVOISF.ConferenceSeries;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceSeriesSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceSeriesSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceSeriesSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceSeries theConferenceSeries = (ConferenceSeries)findAncestorWithClass(this, ConferenceSeries.class);
			if (!theConferenceSeries.commitNeeded) {
				pageContext.getOut().print(theConferenceSeries.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ConferenceSeries for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferenceSeries for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			ConferenceSeries theConferenceSeries = (ConferenceSeries)findAncestorWithClass(this, ConferenceSeries.class);
			return theConferenceSeries.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing ConferenceSeries for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferenceSeries for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			ConferenceSeries theConferenceSeries = (ConferenceSeries)findAncestorWithClass(this, ConferenceSeries.class);
			theConferenceSeries.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing ConferenceSeries for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferenceSeries for subjectURI tag ");
		}
	}
}

