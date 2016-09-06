package edu.uiowa.slis.VIVOISF.WorkshopSeries;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkshopSeriesBFO_0000055 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkshopSeriesBFO_0000055 currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkshopSeriesBFO_0000055.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkshopSeriesBFO_0000055Iterator theWorkshopSeriesBFO_0000055Iterator = (WorkshopSeriesBFO_0000055Iterator)findAncestorWithClass(this, WorkshopSeriesBFO_0000055Iterator.class);
			pageContext.getOut().print(theWorkshopSeriesBFO_0000055Iterator.getBFO_0000055());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkshopSeries for BFO_0000055 tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkshopSeries for BFO_0000055 tag ");
		}
		return SKIP_BODY;
	}
}

