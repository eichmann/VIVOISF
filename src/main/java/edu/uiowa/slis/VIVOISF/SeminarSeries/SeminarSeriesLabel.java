package edu.uiowa.slis.VIVOISF.SeminarSeries;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeminarSeriesLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeminarSeriesLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(SeminarSeriesLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			SeminarSeries theSeminarSeries = (SeminarSeries)findAncestorWithClass(this, SeminarSeries.class);
			if (!theSeminarSeries.commitNeeded) {
				pageContext.getOut().print(theSeminarSeries.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing SeminarSeries for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing SeminarSeries for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			SeminarSeries theSeminarSeries = (SeminarSeries)findAncestorWithClass(this, SeminarSeries.class);
			return theSeminarSeries.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing SeminarSeries for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing SeminarSeries for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			SeminarSeries theSeminarSeries = (SeminarSeries)findAncestorWithClass(this, SeminarSeries.class);
			theSeminarSeries.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing SeminarSeries for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing SeminarSeries for label tag ");
		}
	}
}

