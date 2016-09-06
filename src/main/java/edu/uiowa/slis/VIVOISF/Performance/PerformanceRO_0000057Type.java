package edu.uiowa.slis.VIVOISF.Performance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PerformanceRO_0000057Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PerformanceRO_0000057Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PerformanceRO_0000057Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PerformanceRO_0000057Iterator thePerformanceRO_0000057Iterator = (PerformanceRO_0000057Iterator)findAncestorWithClass(this, PerformanceRO_0000057Iterator.class);
			pageContext.getOut().print(thePerformanceRO_0000057Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Performance for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Performance for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}

