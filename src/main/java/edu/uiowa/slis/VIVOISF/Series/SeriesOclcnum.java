package edu.uiowa.slis.VIVOISF.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeriesOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SeriesOclcnumIterator theSeries = (SeriesOclcnumIterator)findAncestorWithClass(this, SeriesOclcnumIterator.class);
			pageContext.getOut().print(theSeries.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

