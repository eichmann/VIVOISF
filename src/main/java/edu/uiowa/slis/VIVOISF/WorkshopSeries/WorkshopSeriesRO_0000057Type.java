package edu.uiowa.slis.VIVOISF.WorkshopSeries;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkshopSeriesRO_0000057Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkshopSeriesRO_0000057Type currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkshopSeriesRO_0000057Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkshopSeriesRO_0000057Iterator theWorkshopSeriesRO_0000057Iterator = (WorkshopSeriesRO_0000057Iterator)findAncestorWithClass(this, WorkshopSeriesRO_0000057Iterator.class);
			pageContext.getOut().print(theWorkshopSeriesRO_0000057Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkshopSeries for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkshopSeries for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}

