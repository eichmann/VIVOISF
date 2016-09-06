package edu.uiowa.slis.VIVOISF.ConferenceSeries;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceSeriesLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceSeriesLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceSeriesLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceSeries theConferenceSeries = (ConferenceSeries)findAncestorWithClass(this, ConferenceSeries.class);
			if (!theConferenceSeries.commitNeeded) {
				pageContext.getOut().print(theConferenceSeries.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ConferenceSeries for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferenceSeries for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			ConferenceSeries theConferenceSeries = (ConferenceSeries)findAncestorWithClass(this, ConferenceSeries.class);
			return theConferenceSeries.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing ConferenceSeries for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferenceSeries for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			ConferenceSeries theConferenceSeries = (ConferenceSeries)findAncestorWithClass(this, ConferenceSeries.class);
			theConferenceSeries.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing ConferenceSeries for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferenceSeries for label tag ");
		}
	}
}

