package edu.uiowa.slis.VIVOISF.Performance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PerformanceBFO_0000055 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PerformanceBFO_0000055 currentInstance = null;
	private static final Log log = LogFactory.getLog(PerformanceBFO_0000055.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PerformanceBFO_0000055Iterator thePerformanceBFO_0000055Iterator = (PerformanceBFO_0000055Iterator)findAncestorWithClass(this, PerformanceBFO_0000055Iterator.class);
			pageContext.getOut().print(thePerformanceBFO_0000055Iterator.getBFO_0000055());
		} catch (Exception e) {
			log.error("Can't find enclosing Performance for BFO_0000055 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Performance for BFO_0000055 tag ");
		}
		return SKIP_BODY;
	}
}

