package edu.uiowa.slis.VIVOISF.Performance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PerformanceLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PerformanceLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(PerformanceLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Performance thePerformance = (Performance)findAncestorWithClass(this, Performance.class);
			if (!thePerformance.commitNeeded) {
				pageContext.getOut().print(thePerformance.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Performance for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Performance for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Performance thePerformance = (Performance)findAncestorWithClass(this, Performance.class);
			return thePerformance.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Performance for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Performance for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Performance thePerformance = (Performance)findAncestorWithClass(this, Performance.class);
			thePerformance.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Performance for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Performance for label tag ");
		}
	}
}

