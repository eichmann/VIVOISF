package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(areaCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaCodeFAOSTATIterator thearea = (areaCodeFAOSTATIterator)findAncestorWithClass(this, areaCodeFAOSTATIterator.class);
			pageContext.getOut().print(thearea.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing area for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

