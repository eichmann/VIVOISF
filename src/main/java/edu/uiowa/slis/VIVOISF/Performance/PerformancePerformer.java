package edu.uiowa.slis.VIVOISF.Performance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PerformancePerformer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PerformancePerformer currentInstance = null;
	private static final Log log = LogFactory.getLog(PerformancePerformer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PerformancePerformerIterator thePerformancePerformerIterator = (PerformancePerformerIterator)findAncestorWithClass(this, PerformancePerformerIterator.class);
			pageContext.getOut().print(thePerformancePerformerIterator.getPerformer());
		} catch (Exception e) {
			log.error("Can't find enclosing Performance for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Performance for performer tag ");
		}
		return SKIP_BODY;
	}
}

