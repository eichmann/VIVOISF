package edu.uiowa.slis.VIVOISF.WorkshopSeries;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkshopSeriesSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkshopSeriesSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkshopSeriesSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			WorkshopSeries theWorkshopSeries = (WorkshopSeries)findAncestorWithClass(this, WorkshopSeries.class);
			if (!theWorkshopSeries.commitNeeded) {
				pageContext.getOut().print(theWorkshopSeries.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing WorkshopSeries for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkshopSeries for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			WorkshopSeries theWorkshopSeries = (WorkshopSeries)findAncestorWithClass(this, WorkshopSeries.class);
			return theWorkshopSeries.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing WorkshopSeries for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkshopSeries for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			WorkshopSeries theWorkshopSeries = (WorkshopSeries)findAncestorWithClass(this, WorkshopSeries.class);
			theWorkshopSeries.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing WorkshopSeries for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkshopSeries for subjectURI tag ");
		}
	}
}

