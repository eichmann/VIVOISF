package edu.uiowa.slis.VIVOISF.WorkshopSeries;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkshopSeriesLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkshopSeriesLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkshopSeriesLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			WorkshopSeries theWorkshopSeries = (WorkshopSeries)findAncestorWithClass(this, WorkshopSeries.class);
			if (!theWorkshopSeries.commitNeeded) {
				pageContext.getOut().print(theWorkshopSeries.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing WorkshopSeries for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkshopSeries for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			WorkshopSeries theWorkshopSeries = (WorkshopSeries)findAncestorWithClass(this, WorkshopSeries.class);
			return theWorkshopSeries.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing WorkshopSeries for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkshopSeries for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			WorkshopSeries theWorkshopSeries = (WorkshopSeries)findAncestorWithClass(this, WorkshopSeries.class);
			theWorkshopSeries.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing WorkshopSeries for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkshopSeries for label tag ");
		}
	}
}

